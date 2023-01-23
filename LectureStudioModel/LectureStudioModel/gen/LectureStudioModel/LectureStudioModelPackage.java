package LectureStudioModel;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EEnum;


import org.emoflon.smartemf.runtime.SmartPackage;

public interface LectureStudioModelPackage extends SmartPackage {

	String eNAME = "LectureStudioModel";
	String eNS_URI = "platform:/resource/LectureStudioModel/model/LectureStudioModel.ecore";
	String eNS_PREFIX = "LectureStudioModel";

	LectureStudioModelPackage eINSTANCE = LectureStudioModel.impl.LectureStudioModelPackageImpl.init();

	int ROOT = 0;
	int ROOT__NETWORKS = 0;
	int ROOT__CLOCK = 1;
	int ROOT__TIME = 2;
	int ROOT_FEATURE_COUNT = 3;
	int ROOT_OPERATION_COUNT = 0;
	
	int NETWORK = 1;
	int NETWORK__LECTURE_STUDIO_SERVER = 3;
	int NETWORK_FEATURE_COUNT = 1;
	int NETWORK_OPERATION_COUNT = 0;
	
	int LECTURE_STUDIO_SERVER = 2;
	int LECTURE_STUDIO_SERVER__SERVER = 4;
	int LECTURE_STUDIO_SERVER__WAITING_CLIENTS = 5;
	int LECTURE_STUDIO_SERVER__CLIENT_CONTAINER = 6;
	int LECTURE_STUDIO_SERVER_FEATURE_COUNT = 3;
	int LECTURE_STUDIO_SERVER_OPERATION_COUNT = 0;
	
	int NODE = 3;
	int NODE__SEND_BANDWIDTH = 7;
	int NODE__RECEIVE_BANDWIDTH = 8;
	int NODE__DATA = 9;
	int NODE__SERVER_CONNECTION = 10;
	int NODE__CLIENT_CONNECTION = 11;
	int NODE__ID = 12;
	int NODE__IS_RELAY_CLIENT = 13;
	int NODE__CLOCK = 14;
	int NODE__TRANSFERRED_DATA = 15;
	int NODE_FEATURE_COUNT = 9;
	int NODE_OPERATION_COUNT = 0;
	
	int DATA = 4;
	int DATA__SIZE = 16;
	int DATA_FEATURE_COUNT = 1;
	int DATA_OPERATION_COUNT = 0;
	
	int CONNECTION = 5;
	int CONNECTION__SERVER = 17;
	int CONNECTION__CLIENT = 18;
	int CONNECTION__TRANSFER_RATE = 19;
	int CONNECTION_FEATURE_COUNT = 3;
	int CONNECTION_OPERATION_COUNT = 0;
	
	int WAITING_CLIENT_QUEUE = 6;
	int WAITING_CLIENT_QUEUE__CLIENTS = 20;
	int WAITING_CLIENT_QUEUE_FEATURE_COUNT = 1;
	int WAITING_CLIENT_QUEUE_OPERATION_COUNT = 0;
	
	int CONNECTION_DATA = 7;
	int CONNECTION_DATA__SERVER_ID = 21;
	int CONNECTION_DATA__CLIENT_ID = 22;
	int CONNECTION_DATA__BANDWIDTH = 23;
	int CONNECTION_DATA_FEATURE_COUNT = 3;
	int CONNECTION_DATA_OPERATION_COUNT = 0;
	
	int CLIENT_CONTAINER = 8;
	int CLIENT_CONTAINER__CONNECTIONS = 24;
	int CLIENT_CONTAINER__NODES = 25;
	int CLIENT_CONTAINER__CONNECTION_DATA = 26;
	int CLIENT_CONTAINER_FEATURE_COUNT = 3;
	int CLIENT_CONTAINER_OPERATION_COUNT = 0;
	
	int TIME = 9;
	int TIME__CURRENT = 27;
	int TIME_FEATURE_COUNT = 1;
	int TIME_OPERATION_COUNT = 0;
	
	

	EClass getRoot();
	EReference getRoot_Networks();
	EAttribute getRoot_Clock();
	EReference getRoot_Time();
	
	EClass getNetwork();
	EReference getNetwork_LectureStudioServer();
	
	EClass getLectureStudioServer();
	EReference getLectureStudioServer_Server();
	EReference getLectureStudioServer_WaitingClients();
	EReference getLectureStudioServer_ClientContainer();
	
	EClass getNode();
	EAttribute getNode_SendBandwidth();
	EAttribute getNode_ReceiveBandwidth();
	EReference getNode_Data();
	EReference getNode_ServerConnection();
	EReference getNode_ClientConnection();
	EAttribute getNode_Id();
	EAttribute getNode_IsRelayClient();
	EAttribute getNode_Clock();
	EAttribute getNode_TransferredData();
	
	EClass getData();
	EAttribute getData_Size();
	
	EClass getConnection();
	EReference getConnection_Server();
	EReference getConnection_Client();
	EAttribute getConnection_TransferRate();
	
	EClass getWaitingClientQueue();
	EReference getWaitingClientQueue_Clients();
	
	EClass getConnectionData();
	EAttribute getConnectionData_ServerId();
	EAttribute getConnectionData_ClientId();
	EAttribute getConnectionData_Bandwidth();
	
	EClass getClientContainer();
	EReference getClientContainer_Connections();
	EReference getClientContainer_Nodes();
	EReference getClientContainer_ConnectionData();
	
	EClass getTime();
	EAttribute getTime_Current();
	
	
	LectureStudioModel.LectureStudioModelFactory getLectureStudioModelFactory();

	interface Literals {
		
		EClass ROOT = eINSTANCE.getRoot();
		
		EReference ROOT__NETWORKS = eINSTANCE.getRoot_Networks();
		
		EAttribute ROOT__CLOCK = eINSTANCE.getRoot_Clock();
		
		EReference ROOT__TIME = eINSTANCE.getRoot_Time();
		
		EClass NETWORK = eINSTANCE.getNetwork();
		
		EReference NETWORK__LECTURE_STUDIO_SERVER = eINSTANCE.getNetwork_LectureStudioServer();
		
		EClass LECTURE_STUDIO_SERVER = eINSTANCE.getLectureStudioServer();
		
		EReference LECTURE_STUDIO_SERVER__SERVER = eINSTANCE.getLectureStudioServer_Server();
		
		EReference LECTURE_STUDIO_SERVER__WAITING_CLIENTS = eINSTANCE.getLectureStudioServer_WaitingClients();
		
		EReference LECTURE_STUDIO_SERVER__CLIENT_CONTAINER = eINSTANCE.getLectureStudioServer_ClientContainer();
		
		EClass NODE = eINSTANCE.getNode();
		
		EAttribute NODE__SEND_BANDWIDTH = eINSTANCE.getNode_SendBandwidth();
		
		EAttribute NODE__RECEIVE_BANDWIDTH = eINSTANCE.getNode_ReceiveBandwidth();
		
		EReference NODE__DATA = eINSTANCE.getNode_Data();
		
		EReference NODE__SERVER_CONNECTION = eINSTANCE.getNode_ServerConnection();
		
		EReference NODE__CLIENT_CONNECTION = eINSTANCE.getNode_ClientConnection();
		
		EAttribute NODE__ID = eINSTANCE.getNode_Id();
		
		EAttribute NODE__IS_RELAY_CLIENT = eINSTANCE.getNode_IsRelayClient();
		
		EAttribute NODE__CLOCK = eINSTANCE.getNode_Clock();
		
		EAttribute NODE__TRANSFERRED_DATA = eINSTANCE.getNode_TransferredData();
		
		EClass DATA = eINSTANCE.getData();
		
		EAttribute DATA__SIZE = eINSTANCE.getData_Size();
		
		EClass CONNECTION = eINSTANCE.getConnection();
		
		EReference CONNECTION__SERVER = eINSTANCE.getConnection_Server();
		
		EReference CONNECTION__CLIENT = eINSTANCE.getConnection_Client();
		
		EAttribute CONNECTION__TRANSFER_RATE = eINSTANCE.getConnection_TransferRate();
		
		EClass WAITING_CLIENT_QUEUE = eINSTANCE.getWaitingClientQueue();
		
		EReference WAITING_CLIENT_QUEUE__CLIENTS = eINSTANCE.getWaitingClientQueue_Clients();
		
		EClass CONNECTION_DATA = eINSTANCE.getConnectionData();
		
		EAttribute CONNECTION_DATA__SERVER_ID = eINSTANCE.getConnectionData_ServerId();
		
		EAttribute CONNECTION_DATA__CLIENT_ID = eINSTANCE.getConnectionData_ClientId();
		
		EAttribute CONNECTION_DATA__BANDWIDTH = eINSTANCE.getConnectionData_Bandwidth();
		
		EClass CLIENT_CONTAINER = eINSTANCE.getClientContainer();
		
		EReference CLIENT_CONTAINER__CONNECTIONS = eINSTANCE.getClientContainer_Connections();
		
		EReference CLIENT_CONTAINER__NODES = eINSTANCE.getClientContainer_Nodes();
		
		EReference CLIENT_CONTAINER__CONNECTION_DATA = eINSTANCE.getClientContainer_ConnectionData();
		
		EClass TIME = eINSTANCE.getTime();
		
		EAttribute TIME__CURRENT = eINSTANCE.getTime_Current();
		
		
		
		
	}

} 
