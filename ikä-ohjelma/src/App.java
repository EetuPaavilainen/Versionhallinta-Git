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

}
}