/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr_tekper;

import dao.AddDataMemberDAO;
import dao.ListMobilDAO;
import dao.UserDAO;
import entity.JenisMobil;
import entity.Member;
import entity.Users;
import sun.security.jgss.GSSCaller;
import sun.security.jgss.GSSUtil;

/**
 *
 * @author Markus
 */
public class TR_Tekper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Form.Login login = new Form.Login();
        login.setVisible(true);
    }
}
