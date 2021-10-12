public class Main {
    public static void main (String [] args){
        // Кредитный калькулятор(аннуитет)

//        A = S*P*(1+P)^N/((1+P)^N-1), где　
//
//        A – сумма аннуитетного платежа　
//
//        S – сумма кредита 　
//
//        P — месячная процентная ставка (годовая процентная ставка, деленная на 12)　
//
//        N — количество месяцев, на которое оформляется кредит, в случае пересчета графика – количество оставшихся периодов.　


        double loanAmount = 1000000;
        double months = 12;
        double rate = 9.99;
        rate = rate/100/months;
        double prePow = 1 + rate;
        double exponent = months;
        double pow = Math.pow(prePow,exponent) - 1;
        double monthlyPayment = loanAmount * (rate + (rate / pow ));

        System.out.println("Первый год " + Math.round(monthlyPayment));




    }
}


