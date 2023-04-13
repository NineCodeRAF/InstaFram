package model.observer;

import java.util.ArrayList;

public class ObsList implements Subject{
	
	private ArrayList<Obs> observers = new ArrayList<>();
	@Override
	public void register(Obs addObs) {
		// TODO Auto-generated method stub
		if(addObs != null)
		observers.add(addObs);
	}

	@Override
	public void unregister(Obs deleteObs) {
		// TODO Auto-generated method stub
		if(deleteObs != null)
			observers.remove(deleteObs);
	}

	@Override
	public void notifyObserver(String str, Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		for(Obs observer : observers)
			observer.update(str, obj1, obj2);
		
	}

}
