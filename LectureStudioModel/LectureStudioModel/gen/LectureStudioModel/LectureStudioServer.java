package LectureStudioModel;

import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface LectureStudioServer extends EObject {
	
    public LectureStudioModel.Node getServer();
    
    public void setServer(LectureStudioModel.Node value);
    
    public LectureStudioModel.WaitingClientQueue getWaitingClients();
    
    public void setWaitingClients(LectureStudioModel.WaitingClientQueue value);
    
    public LectureStudioModel.ClientContainer getClientContainer();
    
    public void setClientContainer(LectureStudioModel.ClientContainer value);
    

}
