package LectureStudioModel.impl;

import LectureStudioModel.LectureStudioModelPackage;
import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.*;
import org.emoflon.smartemf.runtime.collections.*;
import org.emoflon.smartemf.persistence.SmartEMFResource;
import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.notification.NotifyStatus;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class WaitingClientQueueImpl extends SmartObject implements LectureStudioModel.WaitingClientQueue {

    protected LinkedSmartESet<LectureStudioModel.Node> clients = new LinkedSmartESet<LectureStudioModel.Node>(this, LectureStudioModelPackage.Literals.WAITING_CLIENT_QUEUE__CLIENTS);
	
	protected WaitingClientQueueImpl() {
		super(LectureStudioModelPackage.Literals.WAITING_CLIENT_QUEUE);
	}
	
    
    @Override
    public LinkedSmartESet<LectureStudioModel.Node> getClients() {
    	return this.clients;
    }
    
    @Override
    public void setClients(LinkedSmartESet<LectureStudioModel.Node> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (LectureStudioModelPackage.Literals.WAITING_CLIENT_QUEUE__CLIENTS.equals(eFeature)) {
    		setClients((LinkedSmartESet<LectureStudioModel.Node>) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.WAITING_CLIENT_QUEUE__CLIENTS.equals(eFeature)) {
    		getClients().clear(); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		return super.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.WAITING_CLIENT_QUEUE__CLIENTS.equals(eFeature))
    		return getClients();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
	    	}
}
