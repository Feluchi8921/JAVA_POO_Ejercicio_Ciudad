package Ciudad;

public class main {
    public static void main (String[]args){
        Ciudad ciudad1 = new Ciudad();
        //Inicializo a traves de los setters
        ciudad1.setNombre("Tandil");
        ciudad1.setPais("Argentina");
        ciudad1.setPoblacion(150162);
        ciudad1.setPresidente("Alberto Fernandez");
        System.out.println("Ciudad: "+ciudad1.getNombre()+"\nPaís: "
                +ciudad1.getPais()+"\nPoblación: "+ciudad1.getPoblacion()+"\nPresidente: "+ ciudad1.getPresidente());
    }
}
