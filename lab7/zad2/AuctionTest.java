/*
    Martyna KLebba
    Zadanie 2 
     */
     public class AuctionTest {

    public static void main (String[] args){
        AuctionUser user = new AuctionUser('s')
                .Name("Klaudia", "Klebba")
                .eMail("Klebka@wp.pl")
                .build();
        Auction auction = new Auction('p')
                .Description("samochod")
                .Duration(5)
                .Name("osprzedam samochod")
                .PriceStart(25.0d)
                .addingUser(user)
                .build();
        if(auction.type=='p'){
            if(auction.auctionDuration==0){
                auction.auctionWon(user);
            }
        }else if(auction.type=='w'){
            if(auction.auctionDuration==0){
                auction.auctionWon(user);
                auction.auctionDuration+=1;
            }
        }else if(auction.type=='o'){
            if(auction.isAuctioned()){
                auction.startPrice-=1;
                System.out.println(auction.startPrice);
            }
        }
    }
}
