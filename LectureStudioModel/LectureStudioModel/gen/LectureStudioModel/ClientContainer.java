package LectureStudioModel;

import LectureStudioModel.LectureStudioModelPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface ClientContainer extends EObject {
	
    public LinkedSmartESet<LectureStudioModel.Connection> getConnections();
    
    public void setConnections(LinkedSmartESet<LectureStudioModel.Connection> value);
    
    public LinkedSmartESet<LectureStudioModel.Node> getNodes();
    
    public void setNodes(LinkedSmartESet<LectureStudioModel.Node> value);
    
    public LinkedSmartESet<LectureStudioModel.ConnectionData> getConnectionData();
    
    public void setConnectionData(LinkedSmartESet<LectureStudioModel.ConnectionData> value);
    

}
