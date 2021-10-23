public class Data {
    private int ano;
    private int mes;
    private int dia;
    private String[] meses = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",

            "Outubro", "Novembro", "Dezembro" };

    public Data(int dia, int mes, int ano) {
        switch (mes) {
            case 2:
                // ano bissexto
                if (ano > 0 && (ano % 4 == 0)) {
                    if (dia < 30 && dia > 0) {
                        this.mes = mes;
                        this.dia = dia;

                        this.ano = ano;
                    } else {
                        this.ano = 0; // otimizar duplicatas
                        this.mes = 0;
                        this.dia = 0;
                    }
                } else {
                    if (ano > 0 && (ano % 4 != 0)) {
                        if (dia < 29 && dia > 0) {
                            this.mes = mes;
                            this.dia = dia;
                            this.ano = ano;
                        } else {
                            this.ano = 0; // otimizar duplicatas
                            this.mes = 0;
                            this.dia = 0;
                        }
                    }
                }
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia < 32 && dia > 0 && ano > 0) {
                    this.mes = mes;
                    this.dia = dia;
                    this.ano = ano;
                } else {
                    this.ano = 0;
                    this.mes = 0;
                    this.dia = 0;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (dia < 31 && dia > 0 && ano > 0) {
                    this.mes = mes;
                    this.dia = dia;
                    this.ano = ano;
                } else {
                    this.ano = 0;
                    this.mes = 0;
                    this.dia = 0;
                }
                break;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getStringMes() {
        return meses[mes - 1];
    }

    @Override
    public String toString() {
        return dia + " de " + meses[mes - 1] + " de " + ano;
    }
}
