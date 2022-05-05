package poo;

public class Coche { /// plantilla para crear objetos

    private int ruedas;  // unidades
    private int largo;  // cm
    private int ancho;  // cm
    private int motor; //cm3
    private int peso_plataforma; // kilos
    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean climatizador;

    public Coche(){

        ruedas=4;                   ///aqui se definen las propiedades comunes y no modificables
        ancho=300;
        largo=2000;
        motor=1600;
        peso_plataforma=500;

    }

    public void setColor(String color){ // metodo setter_ modificador de propiedad
        this.color=color;
    }

    public String getTodoComun(){
        return "la plataforma cuenta con un numero de ruedas de: "+ this.ruedas +" tiene un largo de " + this.largo + " cm"+
                " tiene un ancho de "+ this.ancho +" cm" +" y un peso de plataforma de "+this.peso_plataforma
                +" kg"+ this.motor;
    }

    public String getColor(){
        return "el color del coche es:" +this.color;
    }

    public void setAsientos_cuero(String asientos_cuero) {

        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero = false;
        }

    }

    public String getAsientos_cuero() {
        if(asientos_cuero==true) {
            return "el coche tiene asientos de cuero";
        }else{
            return "el coche no tiene asientos de cuero";
        }
    }

    public void setClimatizador(String climatizador){

        if(climatizador.equalsIgnoreCase("si")){///con el equalsIgnoreCase se comparan
            this.climatizador=true;                         //las cadenas de texto con el == no funciona

        }else{
            this.climatizador=false;
        }
    }

    public String getClimatizador(){
        if(climatizador==true){
            return "el Coche tiene climatizador";
        }else{
            return "el Coche no tiene solo aire acondicionado";
        }
    }

    public String dime_peso_coche(){ ///este metodo es setter y getter al tiempo
        int peso_carroceria=500;
        peso_total=peso_plataforma+peso_carroceria;

        if(asientos_cuero==true) {
            peso_total = peso_total + 50;
        }
            if (climatizador==true){

                peso_total=peso_total+20;
            }
        return "el peso del coche es: "+peso_total+" kg";
    }

    public int precio_coche(){
        int precio_final=10000;
        if(asientos_cuero==true){

            precio_final+=2000;

        }

        if(climatizador==true){
            precio_final+=1500;
        }
        return precio_final;
    }
}
