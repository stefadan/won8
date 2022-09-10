package curs7hw1;

public class Company {
    AdvertiseProvider advertiseProvider;
    private int noOfOccurence=5;    //numar de aparitii pentru reclama

    public Company(AdvertiseProvider advertiseProvider, int noOfOccurence) {
        this.advertiseProvider = advertiseProvider;
        this.noOfOccurence = noOfOccurence;
    }

    public void publishAdvertise(){
        for(int i=0; i<noOfOccurence; i++){
            System.out.println(String.format("Publishing advertise for: %s %s %s %s",
                    advertiseProvider.getName(),
                    advertiseProvider.advertiseByEmail(),
                    advertiseProvider.advertiseByFacebook(),
                    advertiseProvider.advertiseByPrint()
                    )
            );
        }
    }

}
