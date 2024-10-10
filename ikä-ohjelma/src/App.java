public class App {
    public static void main(String[] args) throws Exception {
    int ika = 45;
        // tulostusehdot
    if (ika > 0 && ika < 18)
    {
        System.out.println("Olet alaikäinen");
    }
    else if (ika >= 65)
    {
        System.out.println("Olet eläkeläinen");
    }
    else 
    {
        System.out.println("Olet aikuinen");
    }
    if (ika == 15)
    
    {
        System.out.println("Saat ajaa mopolla");
    }
    if (ika == 16 || ika == 17)
    
    {
        System.out.println("Saat ajaa mopolla tai kevarilla");

    }

    if (ika == 18)
    
    {
        System.out.println("Olet nyt täysi-ikäinen ja voit ajaa autoa");
}

if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60)
  
{
    System.out.println("Onneksi olkoon, täytit pyöreitä");
}

if (ika == 100)
    
{
    System.out.println("Onneksi olkoon!");
    System.out.println("Täytit pyöreitä");
    System.out.println("100 vuotta on jo pitkä aika"); 
}

if (ika <= 58 || ika <= 64)
    
{
    System.out.println("Pystytte hakemaan varhaiseläkeelle");
}

if (ika == 65)
    
{
    System.out.println("Toivotamme teille oikein hyviä eläkepäiviä");

}

if (ika >=40 || ika <=50)
    
{
    System.out.println("Toivotamme teille hyvää keski-ikää");
}

}
}