package votecounterproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version Spring 2019
 * @author clatulip
 */
public class ArrayListVoteCounterTest {

    private ArrayListVoteCounter voteCounter;

    @Before
    public void setUp() throws Exception {
        this.voteCounter = new ArrayListVoteCounter();
        /*
        Data Legend:
            [0] = "Darth Sidius"
            [1] = "Darth Maul"
            [2] = "Darth Vader"
            [3] = "Darth Plagueis"
         */
    }

    @Test
    public void recordVote() {
        String candidate = "Darth Sidius";
        // TODO assert both the votes and spoiled votes lists are empty.
               assertEquals(voteCounter.getVotes().size(), 0);
                assertEquals(voteCounter.getSpoiledVotes().size(), 0);
                
                 System.out.println("Darth Maul before votes: " +voteCounter.getSithSenateMemberVotes("Darth Maul"));   
                 System.out.println("votes list before: " + voteCounter.getVotes().size());
                 
                 
        // TODO now, record some votes for one of the candidates. Use the legend 
        // above for clarification
                for (int i = 0; i < 100; i++) {
                    voteCounter.recordVote("Darth Maul");

                }
        

 
        // TODO using the getSithSenateMemberVotes method, make sure your candidate 
        // actually recieved their votes
     System.out.println("Darth Maul after votes: " +voteCounter.getSithSenateMemberVotes("Darth Maul"));   


        
        // TODO assert that the size of the votes list has increased.
        
        System.out.println("votes list after: " + voteCounter.getVotes().size());

        assertEquals(voteCounter.getVotes().size(),100);

    }

}