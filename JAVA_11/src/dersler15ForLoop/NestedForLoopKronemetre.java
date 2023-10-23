package dersler15ForLoop;

public class NestedForLoopKronemetre {
    public static void main(String[] args) {
        System.out.println("Nested for loop ile kronometre...");

        long bekle = 0;
        for (int saat=18; saat<24; saat++){
            for(int dakika = 0; dakika <60; dakika++){
                for (int saniye = 0; saniye <60; saniye++){
                    for (int salise = 0; salise < 100; salise++){
                        System.out.print("\r" + saat + ":" + dakika + ":" + saniye + ":" + salise);

                        for (int counter = 0; counter <5_000_000; counter++){
                            bekle += counter;

                        }
                        bekle = 0;
                    }
                }
            }
        }
    }
}
