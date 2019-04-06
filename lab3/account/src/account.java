public class account {
        private String id;
        private String name;
        private int balance;


        public account(String id, String name){
            this.id=id;
            this.name=name;
            this.balance=0;

        }
        public account (String id, String name, int balance){
            this.id=id;
            this.name=name;
            this.balance=balance;
        }
        public String getid(){
            return id;
        }
        public String getname(){
            return name;
        }
        public int getbalance(){
            return balance;
        }
        public int credit(int amount){
            return balance+amount;
        }
        public int debit(int amount){
            if(amount <= balance)
                balance=amount-balance;
            else
                System.out.println("Przekroczona kwota");
            return balance;
        }
        public int transferTo (int account  , int amount)
        {
            if (amount <= balance)
                balance=account;
            else
                System.out.println("Przekoroczona kwota");
            return balance;

        }
        public String toString()
        {
            return "Account[id= " + id + "  name  "+ name + " balance= " + balance + "]";
        }
}
