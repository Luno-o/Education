import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
    private ImageComponent imageComponent;
    private JFrame jFrame = new JFrame("CD cover Viewer");
    private Hashtable<String, String> cds = new Hashtable<>();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive imageProxyTestDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        cds.put("Buddha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima", "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma", "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.", "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure", "http://images.amazon.com/images/P/B000003SFN.01.ZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2", "http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");

        URL initialURL = new URL(cds.get("Buddha Bar"));
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Favourite CD's");
        menuBar.add(menu);
        jFrame.setJMenuBar(menuBar);
        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                jFrame.repaint();
            });
        }
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        jFrame.getContentPane().add(imageComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);
    }
    URL getCDUrl(String name){
        try {
            return new URL(cds.get(name));
        }catch (MalformedURLException e){
            e.printStackTrace();
            return  null;
        }
    }
}