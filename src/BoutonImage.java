
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author tm325716
 */

public class BoutonImage extends JButton{
    private Image img;
    
    public BoutonImage(Image i){
        super();
        this.img=i;
    }
    
    public BoutonImage(){
        this(null);
    }
    
    public Image getImg(){
        return this.img;
    }
    public void setImg(Image i){
        this.img=i;
    }
    
    public void paint(Graphics g){
        super.paint(g);
        if(img!=null){
            Image imgB= img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
            this.setIcon(new ImageIcon(imgB));
        }
    }
}