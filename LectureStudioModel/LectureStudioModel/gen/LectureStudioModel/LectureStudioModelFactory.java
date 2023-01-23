package LectureStudioModel;

import LectureStudioModel.Root;
import LectureStudioModel.Network;
import LectureStudioModel.LectureStudioServer;
import LectureStudioModel.Node;
import LectureStudioModel.Data;
import LectureStudioModel.Connection;
import LectureStudioModel.WaitingClientQueue;
import LectureStudioModel.ConnectionData;
import LectureStudioModel.ClientContainer;
import LectureStudioModel.Time;

import org.eclipse.emf.ecore.EFactory;

public interface LectureStudioModelFactory extends EFactory {

	LectureStudioModelFactory eINSTANCE = LectureStudioModel.impl.LectureStudioModelFactoryImpl.init();
	
	Root createRoot();
	
	Network createNetwork();
	
	LectureStudioServer createLectureStudioServer();
	
	Node createNode();
	
	Data createData();
	
	Connection createConnection();
	
	WaitingClientQueue createWaitingClientQueue();
	
	ConnectionData createConnectionData();
	
	ClientContainer createClientContainer();
	
	Time createTime();
	
	
	LectureStudioModelPackage getLectureStudioModelPackage();

}
