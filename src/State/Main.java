package State;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        TransformerContext context = new TransformerContext();
        
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
	}
}

