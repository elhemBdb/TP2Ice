package TP2;

import org.xml.sax.helpers.LocatorImpl;

import Ice.Current;
import Ice.LocalObjectHolder;
import Ice.Object;
import Ice.ServantLocator;
import Ice.UserException;

public class Server {

	public static void main(String[] args) {
		int status = 0;
        Ice.Communicator ic = null; // correspond à orb en corba
        try {
            ic = Ice.Util.initialize(args);// init en corba
            Ice.ObjectAdapter adapter =
                ic.createObjectAdapterWithEndpoints("ForumAdapter", "default -p 10003");
            Ice.Object object = new ForumI("ice","damien");
            Ice.Object object2 = new ForumI("ice2","damien2");
            adapter.add(object, ic.stringToIdentity("Forum"));
            adapter.add(object2, ic.stringToIdentity("Forum2"));
          
            adapter.activate();
            try {
				
			} catch (Exception e) {
				adapter.addServantLocator(new MyServantLocator(), "serv1");
			}
            try {
				
			} catch (Exception e) {
				adapter.addServantLocator(new MyServantLocator(), "serv2");
			}
            
            
            ic.waitForShutdown();
        } catch (Ice.LocalException e) {
            e.printStackTrace();
            status = 1;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            status = 1;
        }
        if (ic != null) {
            // Clean up
            //
            try {
                ic.destroy();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                status = 1;
            }
        }
        System.exit(status);

	}

}
