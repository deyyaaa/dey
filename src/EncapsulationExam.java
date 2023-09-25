public class EncapsulationExam {
        public static void main(String[] args) {

            Account acc=new Account();

            acc.setAcc_no(24102003L);
            acc.setName("DeaAuliya");
            acc.setEmail("deaauliyaaa@javatpoint.com");
            acc.setAmount(300000f);

            System.out.println("Acc: " + acc.getAcc_no());
            System.out.println("Name: " + acc.getName());
            System.out.println("Email: " + acc.getEmail());
            System.out.println("Amount: " + acc.getAmount());
        }
    }
