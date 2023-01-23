package LectureStudioModel;

import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Node extends EObject {
	
    public double getSendBandwidth();
    
    public void setSendBandwidth(double value);
    
    public double getReceiveBandwidth();
    
    public void setReceiveBandwidth(double value);
    
    public LectureStudioModel.Data getData();
    
    public void setData(LectureStudioModel.Data value);
    
    public LectureStudioModel.Connection getServerConnection();
    
    public void setServerConnection(LectureStudioModel.Connection value);
    
    public LinkedSmartESet<LectureStudioModel.Connection> getClientConnection();
    
    public void setClientConnection(LinkedSmartESet<LectureStudioModel.Connection> value);
    
    public java.lang.String getId();
    
    public void setId(java.lang.String value);
    
    public boolean isIsRelayClient();
    
    public void setIsRelayClient(boolean value);
    
    public double getClock();
    
    public void setClock(double value);
    
    public double getTransferredData();
    
    public void setTransferredData(double value);
    

}
