package TP2;

import java.util.concurrent.ConcurrentHashMap;

import org.omg.PortableServer.Servant;

import Ice.Current;
import Ice.LocalObjectHolder;
import Ice.Object;
import Ice.UserException;

public class MyServantLocator implements Ice.ServantLocator {
	private ConcurrentHashMap<String,Object> ob=new ConcurrentHashMap<String, Object>();

	@Override
	public Object locate(Current curr, LocalObjectHolder cookie)
			throws UserException {
		// Get the object identity. (We use the name member
        // as the database key.
		
        String name = curr.id.name;
        
        
            Object o = ob.get(name);
            
            return o;

        // We have the state, instantiate a servant and return it.
        //
//        return new ForumI(name, moderator);
	}

	@Override
	public void finished(Current curr, Object servant, java.lang.Object cookie)
			throws UserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deactivate(String category) {
		// TODO Auto-generated method stub
		
	}

}
