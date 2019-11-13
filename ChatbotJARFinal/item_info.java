import java.util.Scanner;
/**
 * Write a description of class item_info here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class item_info
{
    Chat run = new Chat();
        
    Scanner in = new Scanner (System.in);
    String statement = in.nextLine();
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("What is your returns policy?") >= 0)
        {
            response = "You can find more information under the “Returns” tab.";
            System.out.println("You can find more information under the “Returns” tab.");
        }
        else if (statement.indexOf("Where can I find") >= 0
                || statement.indexOf("stickers") >= 0
                || statement.indexOf("books") >= 0
                || statement.indexOf("paintings") >= 0)
        {
            response = "If you need help finding that item, you can enter it in the search bar and it will reroute you to the page.";
            System.out.println(response);
        }
        else if (statement.indexOf("I don't like the item I bought.") >= 0)
        {
            response = "I’m sorry to hear about that. You can find information under the “Returns” tab to return your item.";
        }
        else if (statement.indexOf("What are the dimensions of the <Something> item?") >= 0)
        {
            response = "To see the dimensions of an item, look at the description under the item name.";
        }
        else if (statement.indexOf("Where is the nearest store to me?") >= 0)
        {
            response = "To see the nearest store, turn on location services and click the “Find Stores by Me” tab.";
        }
        else if (statement.indexOf("I need help.") >= 0)
        {
            response = "What do you need help with?";
        }
        else if (statement.indexOf("How can I contact the store manager?") >= 0)
        {
            response = "You can contact the store manager for business inquiries only. Their email is something@store.com. If you have a consumer complaint or any other concerns, please call +1 (123)456-7890.";
        }
        else if (statement.indexOf("I like your company.") >= 0)
        {
            response = "Thank you!";
        }
        else if (statement.indexOf("I don't like your company.") >= 0)
        {
            response = "Oh no! I’m sorry to hear that. If you fill out this survey <Link>, we will resolve your problem.";
        }
        else if (statement.indexOf("Are you hiring?") >= 0)
        {
            response = "No, sorry.";
        }
        else if (statement.indexOf("No") >= 0)
        {
            response = "Oh";
        }
        else if (statement.indexOf("Can I sign up for your rewards program?") >= 0)
        {
            response = "We don’t have a rewards program.";
        }
        else if (statement.indexOf("Can I talk to a real person?") >= 0)
        {
            response = "Yes, hold on.";
        }
        else if (statement.indexOf("I have a concern.") >= 0)
        {
            response = "What is your concern?";
        }
        else if (statement.indexOf("How long does an item take to ship?") >= 0)
        {
            response = "An item typically takes around 3-5 business days to ship";
        }
        else if (statement.indexOf("Do you have discounts on items?") >= 0)
        {
            response = "To view the discounted items, click the “Sale” tab.";
        }
        else if (statement.indexOf("The picture on the website was not what I expected the product to look like.") >= 0)
        {
            response = "Oh. Was it the size or color?";
        }
        else if (statement.indexOf("Size") >= 0)
        {
            response = "The sizes are listed under the item description.";
        }
        else if (statement.indexOf("Color") >= 0)
        {
            response = "I’m sorry to hear that. The room we take the photos in are have lighting to portray an accurate product and we do not use filters. If you would like to return this item, please look at the returns policy under the “Returns” tab.";
        }
        else if (statement.indexOf("My child accidentally bought an item.") >= 0)
        {
            response = "Kids are kids. If you would like to return that item, please look at the returns policy under the “Returns” tab.";
        }
        else if (statement.indexOf("Why was I charged for something I didn’t buy?") >= 0)
        {
            response = "Oh no! To return it, please look at the returns policy under the “Returns” tab.";
        }else if (statement.indexOf("I’ve had this item for a little over <number> months, but it is not damaged. I want to return it. ") >= 0)
        {
            response = "Please look at the returns policy under the “Returns” tab to see if your item is eligible for return.";
        }else if (statement.indexOf("My item is damaged. Can I return it?") >= 0)
        {
            response = "I’m sorry but if an item has been damaged by you, we can’t replace it. If it came damaged, please look at the returns policy under the “Returns” tab to see if your item is eligible for return.";
        }
        else if (statement.indexOf("Do you have birthday rewards?") >= 0)
        {
            response = "If you have created an account, you should get a little surprise on your birthday.";
        }
        else if (statement.indexOf("How much is shipping?") >= 0)
        {
            response = "Shipping is free!";
        }
        else if (statement.indexOf("Today I went to the store and had an issue with ") >= 0
                || statement.indexOf("customer service") >= 0
                || statement.indexOf("people") >= 0
                || statement.indexOf("finding") >= 0)
        {
            response = "I’m so sorry to hear that. Please fill out this survey on what we can do to make future customer visits better.";
        }
        else if (statement.indexOf("Are you closed on ") >= 0
                || statement.indexOf("Sunday") >= 0
                || statement.indexOf("Monday") >= 0
                || statement.indexOf("Tuesday") >= 0
                || statement.indexOf("Wednesday") >= 0
                || statement.indexOf("Thursday") >= 0
                || statement.indexOf("Friday") >= 0
                || statement.indexOf("Saturday") >= 0)
        {
            response = "We are open every day from 9am-8 pm, with the exception of national holidays.";
        }
        //  else if (statement.indexOf("Will you restock the ") >= 0
               //   || statement.indexOf("") >= 0
              //  || statement.indexOf(" .") >= 0)
        //  {
        //       response = "If an item is in high demand, we will bring the item back.";
        //   }
        else if (statement.indexOf("Help") >= 0)
        {
            response = "What do you need help with?";
        }
        else if (statement.indexOf("Find") >= 0)
        {
            response = "What do you want to find?";
        }
        else if (statement.indexOf("Thank you.") >= 0)
        {
            response = "You’re welcome. Thank you for supporting our business.";
        }
        else if (statement.indexOf("I like my item.") >= 0)
        {
            response = "I'm glad to hear that.";
        }
        else if (statement.indexOf("You're unhelpful.") >= 0)
        {
            response = "Oh no! I’m sorry I was unhelpful. If you have any suggestions, please let me know. If you would like to speak with a real person, please say “Real Person”.";
        }
        else if (statement.indexOf("Real Persom") >= 0)
        {
            response = "Hold on...we’re connecting you with a real person.";
        }
        
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
     private String getRandomResponse()
     {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
     }

}
