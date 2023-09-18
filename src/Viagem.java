public class Viagem {
    private int id;
    private Cliente cliente;
    private Bicicleta bicicleta;
    private Date inicio;
    private Date fim;
    private double taxa;

    public Viagem(int id, Cliente cliente, Bicicleta bicicleta, Date inicio) {
        this.id = id;
        this.cliente = cliente;
        this.bicicleta = bicicleta;
        this.inicio = inicio;
        this.fim = null;
        this.taxa = 0.0;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public double getTaxa() {
        return taxa;
    }

    public void calcularTaxa() {
        long duracaoMinutos = calcularDuracaoMinutos();
        double taxaBase = 0.0;

        if (cliente.getTipoCliente() == 2 || cliente.getTipoCliente() == 3) {
            // Assinatura mensal ou anual
            int viagensDiarias = duracaoMinutos / 30; // Divide a duração em intervalos de 30 minutos
            int viagensGratuitas = Math.min(viagensDiarias, 4); // Até 4 viagens diárias são gratuitas

            // Calcula a taxa base para viagens excedentes
            if (viagensDiarias > 4) {
                taxaBase = (viagensDiarias - 4) * TaxasAluguel.getTaxaAvulsa();
            }

            // Calcula a taxa total
            taxa = taxaBase + (duracaoMinutos - viagensGratuitas * 30) * TaxasAluguel.getTaxaAvulsa();
        } else if (cliente.getTipoCliente() == 1) {
            // Assinatura diária
            if (duracaoMinutos > 120) {
                // Excedeu o tempo permitido de 2 horas
                int minutosExcedidos = duracaoMinutos - 120;
                int intervalos30Minutos = (minutosExcedidos + 29) / 30; // Arredonda para cima
                taxa = TaxasAluguel.getTaxaDiaria() + intervalos30Minutos * TaxasAluguel.getTaxaAvulsa();
            } else {
                // Não excedeu o tempo permitido de 2 horas
                taxa = TaxasAluguel.getTaxaDiaria();
            }
        } else {
            // Não assinante
            if (duracaoMinutos > 15) {
                // Excedeu os 15 minutos gratuitos
                taxa = TaxasAluguel.getTaxaMinutoExcedido() * (duracaoMinutos - 15);
            } else {
                // Não excedeu os 15 minutos gratuitos
                taxa = 0.0;
            }
        }
    }

    private double calcularTempoExcedidoMinutos() {
        if (fim != null) {
            long diferencaMillis = fim.getTime() - inicio.getTime();
            return (double) diferencaMillis / (60 * 1000); // Converter para minutos
        } else {
            return 0.0; // A viagem ainda está em andamento
        }
    }
}