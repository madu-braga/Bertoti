package forma;

public class Circulo implements Forma{

    private Integer posX = 5;
    private Integer posY = 8;
    private Integer radius = 5;

    @Override
    public void desenhar() {
        for (int i = 0;i <= posX + radius; i++) {
            for (int j = 1;j <=posY + radius; j++) {
                int xSquared = (i - posX)*(i - posX);
                int ySquared = (j - posY)*(j - posY);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n\n");
    }
    
}
