package AbstractionJava;


// logic regarding any event lives in the abstract class, while logic regarding the 
// specific event lives the appropriate class

// public class PasswordChangeEvent implements Event {
public class PasswordChangeEvent extends AbstractEvent{

//     private final Long createdTimestamp;
//     private final String id;

    // it call AbstractEvent constructor
    public PasswordChangeEvent(String id) {
        super(id);
    }
//     
//     public PasswordChangeEvent(String id) {
//         this.id = id;
//         this.createdTimestamp = new Timestamp(System
//                 .currentTimeMillis()).getTime();
//     }


//     Doesn't need to write again because AbstractEvent already has it
//     @Override
//     public Long getTimeStamp() {
//         return this.createdTimestamp;
//     }
    @Override
    public void process() {
        System.out.println("Customer " + id + " changed their password. " +
                "Sending a confirmation email to the customer.");
    }

}
