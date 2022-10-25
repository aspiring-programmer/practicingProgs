public class DuplicatesLinearSearch {
    public static void main(String[] args)    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};

        String NewEmail="monica.geller@xyz.com";
        // Write your code here
        System.out.println(duplicateCheck(emails, NewEmail));

    }

    public static int duplicateCheck(String[] array, String NewEmail){
        int found = -1;
        for(int i = 0; i < array.length ; i++){

            if(NewEmail.equals(array[i])) {
                found = i;
                break;
            }
        }
        return found;
    }
}
