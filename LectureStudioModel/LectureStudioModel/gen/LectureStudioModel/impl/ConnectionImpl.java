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

public class ConnectionImpl extends SmartObject implements LectureStudioModel.Connection {

    protected LectureStudioModel.Node server = null;
    protected LectureStudioModel.Node client = null;
    protected double transferRate = 0.0;
	
	protected ConnectionImpl() {
		super(LectureStudioModelPackage.Literals.CONNECTION);
	}
	
    
    @Override
    public LectureStudioModel.Node getServer() {
    	return this.server;
    }
    
    @Override
    public void setServer(LectureStudioModel.Node value) {
    	
    	Object oldValue = this.server;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.server = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.CONNECTION__SERVER, oldValue, value, -1));
    	        	
    	
    	        	if(oldValue != null) {
    	        		((SmartObject) oldValue).eInverseRemove(this, LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION);
    	        	}
    	        	if(value != null) {
    	        		((SmartObject) value).eInverseAdd(this, LectureStudioModelPackage.Literals.NODE__CLIENT_CONNECTION);
    	        	}
    }
    
    private void setServerAsInverse(LectureStudioModel.Node value) {
			    
			    Object oldValue = this.server;
			    
			    if(value == null && oldValue == null)
			    	return;
			    	
			    if(value != null && value.equals(oldValue))
			    	return;
			    	
			    
			    
			    	        this.server = value;
			    
			    
			            	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.CONNECTION__SERVER, oldValue, value, -1));
			            	
    }
    
    @Override
    public LectureStudioModel.Node getClient() {
    	return this.client;
    }
    
    @Override
    public void setClient(LectureStudioModel.Node value) {
    	
    	Object oldValue = this.client;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.client = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.CONNECTION__CLIENT, oldValue, value, -1));
    	        	
    	
    	        	if(oldValue != null) {
    	        		((SmartObject) oldValue).eInverseRemove(this, LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION);
    	        	}
    	        	if(value != null) {
    	        		((SmartObject) value).eInverseAdd(this, LectureStudioModelPackage.Literals.NODE__SERVER_CONNECTION);
    	        	}
    }
    
    private void setClientAsInverse(LectureStudioModel.Node value) {
			    
			    Object oldValue = this.client;
			    
			    if(value == null && oldValue == null)
			    	return;
			    	
			    if(value != null && value.equals(oldValue))
			    	return;
			    	
			    
			    
			    	        this.client = value;
			    
			    
			            	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.CONNECTION__CLIENT, oldValue, value, -1));
			            	
    }
    
    @Override
    public double getTransferRate() {
    	return this.transferRate;
    }
    
    @Override
    public void setTransferRate(double value) {
    	Object oldValue = this.transferRate;
    	this.transferRate = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.CONNECTION__TRANSFER_RATE, oldValue, value, -1));
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (LectureStudioModelPackage.Literals.CONNECTION__SERVER.equals(eFeature)) {
    		setServer((LectureStudioModel.Node) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CONNECTION__CLIENT.equals(eFeature)) {
    		setClient((LectureStudioModel.Node) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CONNECTION__TRANSFER_RATE.equals(eFeature)) {
    		setTransferRate((double) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.CONNECTION__SERVER.equals(eFeature)) {
    		setServer((LectureStudioModel.Node)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CONNECTION__CLIENT.equals(eFeature)) {
    		setClient((LectureStudioModel.Node)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CONNECTION__TRANSFER_RATE.equals(eFeature)) {
    		setTransferRate((double)0.0); 
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
    	if (LectureStudioModelPackage.Literals.CONNECTION__SERVER.equals(eFeature))
    		return getServer();
    	if (LectureStudioModelPackage.Literals.CONNECTION__CLIENT.equals(eFeature))
    		return getClient();
    	if (LectureStudioModelPackage.Literals.CONNECTION__TRANSFER_RATE.equals(eFeature))
    		return getTransferRate();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (LectureStudioModelPackage.Literals.CONNECTION__SERVER.equals(feature)) {
setServerAsInverse((LectureStudioModel.Node) otherEnd); 
 	return;
			        }	
if (LectureStudioModelPackage.Literals.CONNECTION__CLIENT.equals(feature)) {
setClientAsInverse((LectureStudioModel.Node) otherEnd); 
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (LectureStudioModelPackage.Literals.CONNECTION__SERVER.equals(feature)) {
setServerAsInverse(null); 
 	return;
			        }
if (LectureStudioModelPackage.Literals.CONNECTION__CLIENT.equals(feature)) {
setClientAsInverse(null); 
 	return;
			        }
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
