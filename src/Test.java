import java.awt.*;
import java.awt.event.*;

public class Test extends Frame implements WindowListener,ActionListener {
    TextField text = new TextField(20);
    Button b;
    private int numClicks = 0;



    private Button btnClick;
    private EditText Name, Date;
    private TextView msg, NameOut, DateOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnClick = (Button) findViewById(R.id.button) ;
        btnClick.setOnClickListener(this);
        Name = (EditText) findViewById(R.id.textenter) ;
        Date = (EditText) findViewById(R.id.editText) ;
        msg = (TextView) findViewById(R.id.txtviewOut) ;
        NameOut = (TextView) findViewById(R.id.txtoutName) ;
        DateOut = (TextView) findViewById(R.id.txtOutDate) ;
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    public void onClick(View v)
    {
        if (v == btnClick)
        {
            if (Name.equals("") == false && Date.equals("") == false)
            {
                NameOut = Name;
                DateOut = Date;
                msg.setVisibility(View.VISIBLE);
            }
            else
            {
                msg.setText("Please complete both fields");
                msg.setVisibility(View.VISIBLE);
            }
        }
        return;

    }

    /*    try {

            Db.writew();
        }  catch (Exception e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }*/


    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}