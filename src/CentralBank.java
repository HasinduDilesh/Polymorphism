public class CentralBank {
    void leasingRate() {
        System.out.println("30% below!");
    }
}
class CommercialBank extends CentralBank{
    void housingLoanRate(){
        System.out.println("20%");
    }
    void leasingRate() {
        System.out.println("25%");
    }
}
class CommercialLeasing extends CommercialBank{
    @Override
    void leasingRate() {
        System.out.println("23%");
    }
}
class CommercialCredit extends CommercialBank{
    @Override
    void housingLoanRate() {
        System.out.println("25%");
    }

    void leasingRate() {
        System.out.println("22%");
    }
}
class rateResult{
    public static void main(String[] args) {
        CentralBank c = new CentralBank();
        CentralBank cb = new CommercialBank();
        CentralBank cl = new CommercialLeasing();
        CentralBank cc = new CommercialCredit();
        c.leasingRate();
        cb.leasingRate();
        cl.leasingRate();
        cc.leasingRate();

        CommercialBank ccb = new CommercialBank();
        CommercialBank ccc = new CommercialCredit();
        ccb.housingLoanRate();
        ccc.housingLoanRate();
    }
}