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

public class LectureStudioServerImpl extends SmartObject implements LectureStudioModel.LectureStudioServer {

    protected LectureStudioModel.Node server = null;
    protected LectureStudioModel.WaitingClientQueue waitingClients = null;
    protected LectureStudioModel.ClientContainer clientContainer = null;
	
	protected LectureStudioServerImpl() {
		super(LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER);
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
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__SERVER, oldValue, value, -1));
    	        	
    	        	if(LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__SERVER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__SERVER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__SERVER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public LectureStudioModel.WaitingClientQueue getWaitingClients() {
    	return this.waitingClients;
    }
    
    @Override
    public void setWaitingClients(LectureStudioModel.WaitingClientQueue value) {
    	
    	Object oldValue = this.waitingClients;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	Resource.Internal resource = (Resource.Internal) eResource();
    		        if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(null);
    		        }
    		        
    		        NotifyStatus status = NotifyStatus.SUCCESS_NO_NOTIFICATION;
    	if(oldValue != null) {
    	        		status = ((MinimalSObjectContainer) oldValue).resetContainment();
    	}	
    	
    		        this.waitingClients = value;
    	
    	
    	if(value != null)
    		status = ((MinimalSObjectContainer) this.waitingClients).setContainment(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__WAITING_CLIENTS);
    	
    			 	if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(resource);
    		        }
    	
    	if(status == NotifyStatus.SUCCESS_NO_NOTIFICATION || oldValue != null && value != null)
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__WAITING_CLIENTS, oldValue, value, -1));
    	        	
    	        	if(LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__WAITING_CLIENTS.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__WAITING_CLIENTS.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__WAITING_CLIENTS.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public LectureStudioModel.ClientContainer getClientContainer() {
    	return this.clientContainer;
    }
    
    @Override
    public void setClientContainer(LectureStudioModel.ClientContainer value) {
    	
    	Object oldValue = this.clientContainer;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	Resource.Internal resource = (Resource.Internal) eResource();
    		        if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(null);
    		        }
    		        
    		        NotifyStatus status = NotifyStatus.SUCCESS_NO_NOTIFICATION;
    	if(oldValue != null) {
    	        		status = ((MinimalSObjectContainer) oldValue).resetContainment();
    	}	
    	
    		        this.clientContainer = value;
    	
    	
    	if(value != null)
    		status = ((MinimalSObjectContainer) this.clientContainer).setContainment(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__CLIENT_CONTAINER);
    	
    			 	if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(resource);
    		        }
    	
    	if(status == NotifyStatus.SUCCESS_NO_NOTIFICATION || oldValue != null && value != null)
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__CLIENT_CONTAINER, oldValue, value, -1));
    	        	
    	        	if(LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__CLIENT_CONTAINER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__CLIENT_CONTAINER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__CLIENT_CONTAINER.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__SERVER.equals(eFeature)) {
    		setServer((LectureStudioModel.Node) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__WAITING_CLIENTS.equals(eFeature)) {
    		setWaitingClients((LectureStudioModel.WaitingClientQueue) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__CLIENT_CONTAINER.equals(eFeature)) {
    		setClientContainer((LectureStudioModel.ClientContainer) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__SERVER.equals(eFeature)) {
    		setServer((LectureStudioModel.Node)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__WAITING_CLIENTS.equals(eFeature)) {
    		setWaitingClients((LectureStudioModel.WaitingClientQueue)null); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__CLIENT_CONTAINER.equals(eFeature)) {
    		setClientContainer((LectureStudioModel.ClientContainer)null); 
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
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__SERVER.equals(eFeature))
    		return getServer();
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__WAITING_CLIENTS.equals(eFeature))
    		return getWaitingClients();
    	if (LectureStudioModelPackage.Literals.LECTURE_STUDIO_SERVER__CLIENT_CONTAINER.equals(eFeature))
    		return getClientContainer();
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
if(getWaitingClients() != null)
	setResourceCall.accept((SmartObject) getWaitingClients());
if(getClientContainer() != null)
	setResourceCall.accept((SmartObject) getClientContainer());
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
if(getWaitingClients() != null)
    ((SmartObject) getWaitingClients()).setResourceSilently(r);
if(getClientContainer() != null)
    ((SmartObject) getClientContainer()).setResourceSilently(r);
	    	}
}
