public class Pizza {

    /**
    protected String [] tipus = new String[]{"margarita", "quatre formatges", "funghi"};
    protected String [] midas = new String[]{"mitjana", "familiar"};
     **/
    private String tipo;
    private String mida;

    public int TotalDemanades = 0;
    private int TotalServides = 0;

    public Pizza(){

    }

    public Pizza(String tipo, String mida){
        this.mida=mida;
        this.tipo=tipo;
    }

    public int sirve(){
        System.out.println("aquesta pizza ja s'ha servit");
        return 0;
    }


}
