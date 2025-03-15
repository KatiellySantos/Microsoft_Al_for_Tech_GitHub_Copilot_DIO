public class cartaoValidador {

	public static String validarBandeira(String numeroCartao) {
        String[][] bandeiras = {
            {"^5[1-5][0-9]{14}$", "Mastercard"},
            {"^4[0-9]{12}(?:[0-9]{3})?$", "Visa"},
            {"^3[47][0-9]{13}$", "American Express"},
            {"^(?:2131|1800|35\\d{3})\\d{11}$", "JCB"},
            {"^8699[0-9]{11}$", "Voyager"},
            {"^50[0-9]{14,17}$", "Aura"},
            {"^(2014|2149)\\d{11}$", "EnRoute"},
            {"^3(?:0[0-5]|[68][0-9])[0-9]{11}$", "Diners Club"},
            {"^6(?:011|5[0-9]{2})[0-9]{12}$", "Discover"},
            {"^(606282|3841)[0-9]{10,11}$", "Hipercard"}
        };

        for (String[] bandeira : bandeiras) {
            if (numeroCartao.matches(bandeira[0])) {
                return bandeira[1];
            }
        }
        return "Bandeira desconhecida";
    }

    public static void main(String[] args) {
        String numeroCartao = "6011565994344071"; // Exemplo de número de cartão
        String bandeira = validarBandeira(numeroCartao);
        System.out.println("A bandeira do cartão é: " + bandeira);
    }	
}
