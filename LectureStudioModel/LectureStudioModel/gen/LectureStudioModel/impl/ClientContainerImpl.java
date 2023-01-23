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

public class ClientContainerImpl extends SmartObject implements LectureStudioModel.ClientContainer {

    protected LinkedSmartESet<LectureStudioModel.Connection> connections = new LinkedSmartESet<LectureStudioModel.Connection>(this, LectureStudioModelPackage.Literals.CLIENT_CONTAINER__CONNECTIONS);
    protected LinkedSmartESet<LectureStudioModel.Node> nodes = new LinkedSmartESet<LectureStudioModel.Node>(this, LectureStudioModelPackage.Literals.CLIENT_CONTAINER__NODES);
    protected LinkedSmartESet<LectureStudioModel.ConnectionData> connectionData = new LinkedSmartESet<LectureStudioModel.ConnectionData>(this, LectureStudioModelPackage.Literals.CLIENT_CONTAINER__CONNECTION_DATA);
	
	protected ClientContainerImpl() {
		super(LectureStudioModelPackage.Literals.CLIENT_CONTAINER);
	}
	
    
    @Override
    public LinkedSmartESet<LectureStudioModel.Connection> getConnections() {
    	return this.connections;
    }
    
    @Override
    public void setConnections(LinkedSmartESet<LectureStudioModel.Connection> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    
    @Override
    public LinkedSmartESet<LectureStudioModel.Node> getNodes() {
    	return this.nodes;
    }
    
    @Override
    public void setNodes(LinkedSmartESet<LectureStudioModel.Node> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    
    @Override
    public LinkedSmartESet<LectureStudioModel.ConnectionData> getConnectionData() {
    	return this.connectionData;
    }
    
    @Override
    public void setConnectionData(LinkedSmartESet<LectureStudioModel.ConnectionData> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__CONNECTIONS.equals(eFeature)) {
    		setConnections((LinkedSmartESet<LectureStudioModel.Connection>) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__NODES.equals(eFeature)) {
    		setNodes((LinkedSmartESet<LectureStudioModel.Node>) newValue); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__CONNECTION_DATA.equals(eFeature)) {
    		setConnectionData((LinkedSmartESet<LectureStudioModel.ConnectionData>) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__CONNECTIONS.equals(eFeature)) {
    		getConnections().clear(); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__NODES.equals(eFeature)) {
    		getNodes().clear(); 
    		return;
    	}
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__CONNECTION_DATA.equals(eFeature)) {
    		getConnectionData().clear(); 
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
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__CONNECTIONS.equals(eFeature))
    		return getConnections();
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__NODES.equals(eFeature))
    		return getNodes();
    	if (LectureStudioModelPackage.Literals.CLIENT_CONTAINER__CONNECTION_DATA.equals(eFeature))
    		return getConnectionData();
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
    	for(Object obj : getConnections()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
    	for(Object obj : getNodes()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
    	for(Object obj : getConnectionData()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
    	for(Object obj : getConnections()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
    	for(Object obj : getNodes()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
    	for(Object obj : getConnectionData()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
	    	}
}
