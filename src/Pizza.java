public class Pizza {

    private String tipo;
    private String mida;
    private boolean estat;

    private static int TotalDemanades = 0;
    private static int TotalServides = 0;

    public Pizza(){

    }

    public Pizza(String tipo, String mida){
        tipus(tipo);
        midas(mida);
        TotalDemanades+=1;
        estat=false;
    }

    public void sirve(){
        if(estat){
            System.out.println("aquesta pizza ja s'ha servit");
        }else{
            System.out.println("aquesta pizza está pedida");
            TotalServides += 1;
        }
        estat = true;
    }

    private void tipus (String tipo){
        String [] Ptipo = {"margarita", "quatre formatges", "funghi"};
        boolean Ptipus = false;
        for(int i = 0;i < Ptipo.length && !Ptipus; i++){
            if(Ptipo[i].equals(tipo)){
                Ptipus = true;
            }
            if(Ptipus){
                this.tipo=tipo;
            }else{

            }
        }
    }

    private void midas (String mida){
        String [] Pmida = {"mitjana", "familiar"};
        boolean Pmidas = false;
        for(int i = 0;i < Pmida.length && !Pmidas;i++){
            if(Pmida[i].equals(mida)){
                Pmidas = true;
            }
            if(Pmidas){
                this.mida=mida;
            }else{

            }
        }
    }

    public static int getTotalDemanades(){return TotalDemanades;}
    public static int getTotalServides(){return TotalServides;}

    @Override
    public String toString(){
        return "Pizza "+tipo+" "+mida+", demanada";
    }

    

}
