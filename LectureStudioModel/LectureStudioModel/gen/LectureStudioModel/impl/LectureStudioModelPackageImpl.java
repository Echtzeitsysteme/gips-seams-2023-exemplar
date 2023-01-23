package LectureStudioModel.impl;

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


import LectureStudioModel.LectureStudioModelFactory;
import LectureStudioModel.LectureStudioModelPackage;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emoflon.smartemf.runtime.SmartPackageImpl;

public class LectureStudioModelPackageImpl extends SmartPackageImpl
		implements LectureStudioModelPackage {
			
	private EClass rootEClass = null;
	private EReference root_networksEReference = null;
	private EAttribute root_clockEAttribute = null;
	private EReference root_timeEReference = null;
	private EClass networkEClass = null;
	private EReference network_lectureStudioServerEReference = null;
	private EClass lectureStudioServerEClass = null;
	private EReference lectureStudioServer_serverEReference = null;
	private EReference lectureStudioServer_waitingClientsEReference = null;
	private EReference lectureStudioServer_clientContainerEReference = null;
	private EClass nodeEClass = null;
	private EAttribute node_sendBandwidthEAttribute = null;
	private EAttribute node_receiveBandwidthEAttribute = null;
	private EReference node_dataEReference = null;
	private EReference node_serverConnectionEReference = null;
	private EReference node_clientConnectionEReference = null;
	private EAttribute node_idEAttribute = null;
	private EAttribute node_isRelayClientEAttribute = null;
	private EAttribute node_clockEAttribute = null;
	private EAttribute node_transferredDataEAttribute = null;
	private EClass dataEClass = null;
	private EAttribute data_sizeEAttribute = null;
	private EClass connectionEClass = null;
	private EReference connection_serverEReference = null;
	private EReference connection_clientEReference = null;
	private EAttribute connection_transferRateEAttribute = null;
	private EClass waitingClientQueueEClass = null;
	private EReference waitingClientQueue_clientsEReference = null;
	private EClass connectionDataEClass = null;
	private EAttribute connectionData_serverIdEAttribute = null;
	private EAttribute connectionData_clientIdEAttribute = null;
	private EAttribute connectionData_bandwidthEAttribute = null;
	private EClass clientContainerEClass = null;
	private EReference clientContainer_connectionsEReference = null;
	private EReference clientContainer_nodesEReference = null;
	private EReference clientContainer_connectionDataEReference = null;
	private EClass timeEClass = null;
	private EAttribute time_currentEAttribute = null;
	
	

	private LectureStudioModelPackageImpl() {
		super(eNS_URI, LectureStudioModel.LectureStudioModelFactory.eINSTANCE);
	}

	private static boolean isRegistered = false;
	private boolean isCreated = false;
	private boolean isInitialized = false;

	public static LectureStudioModelPackage init() {
		if (isRegistered)
			return (LectureStudioModelPackage) EPackage.Registry.INSTANCE
					.getEPackage(LectureStudioModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLectureStudioModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LectureStudioModelPackageImpl theLectureStudioModelPackage = registeredLectureStudioModelPackage instanceof LectureStudioModelPackageImpl
				? (LectureStudioModelPackageImpl) registeredLectureStudioModelPackage
				: new LectureStudioModelPackageImpl();

		isRegistered = true;

		// Create package meta-data objects
		theLectureStudioModelPackage.createPackageContents();

		// Initialize created meta-data
		theLectureStudioModelPackage.initializePackageContents();
		
		// Inject internal eOpposites to unidirectional references
		theLectureStudioModelPackage.injectDynamicOpposites();
		
		// Inject external references into foreign packages
		theLectureStudioModelPackage.injectExternalReferences();

		// Mark meta-data to indicate it can't be changed
		theLectureStudioModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LectureStudioModelPackage.eNS_URI,
				theLectureStudioModelPackage);
				
		theLectureStudioModelPackage.fetchDynamicEStructuralFeaturesOfSuperTypes();
		return theLectureStudioModelPackage;
	}

	@Override
	public EClass getRoot() {
		return rootEClass;
	}
	@Override
	public EReference getRoot_Networks() {
		return root_networksEReference;	
	}
	@Override
	public EAttribute getRoot_Clock() {
		return root_clockEAttribute;	
	}
	@Override
	public EReference getRoot_Time() {
		return root_timeEReference;	
	}
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}
	@Override
	public EReference getNetwork_LectureStudioServer() {
		return network_lectureStudioServerEReference;	
	}
	@Override
	public EClass getLectureStudioServer() {
		return lectureStudioServerEClass;
	}
	@Override
	public EReference getLectureStudioServer_Server() {
		return lectureStudioServer_serverEReference;	
	}
	@Override
	public EReference getLectureStudioServer_WaitingClients() {
		return lectureStudioServer_waitingClientsEReference;	
	}
	@Override
	public EReference getLectureStudioServer_ClientContainer() {
		return lectureStudioServer_clientContainerEReference;	
	}
	@Override
	public EClass getNode() {
		return nodeEClass;
	}
	@Override
	public EAttribute getNode_SendBandwidth() {
		return node_sendBandwidthEAttribute;	
	}
	@Override
	public EAttribute getNode_ReceiveBandwidth() {
		return node_receiveBandwidthEAttribute;	
	}
	@Override
	public EReference getNode_Data() {
		return node_dataEReference;	
	}
	@Override
	public EReference getNode_ServerConnection() {
		return node_serverConnectionEReference;	
	}
	@Override
	public EReference getNode_ClientConnection() {
		return node_clientConnectionEReference;	
	}
	@Override
	public EAttribute getNode_Id() {
		return node_idEAttribute;	
	}
	@Override
	public EAttribute getNode_IsRelayClient() {
		return node_isRelayClientEAttribute;	
	}
	@Override
	public EAttribute getNode_Clock() {
		return node_clockEAttribute;	
	}
	@Override
	public EAttribute getNode_TransferredData() {
		return node_transferredDataEAttribute;	
	}
	@Override
	public EClass getData() {
		return dataEClass;
	}
	@Override
	public EAttribute getData_Size() {
		return data_sizeEAttribute;	
	}
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}
	@Override
	public EReference getConnection_Server() {
		return connection_serverEReference;	
	}
	@Override
	public EReference getConnection_Client() {
		return connection_clientEReference;	
	}
	@Override
	public EAttribute getConnection_TransferRate() {
		return connection_transferRateEAttribute;	
	}
	@Override
	public EClass getWaitingClientQueue() {
		return waitingClientQueueEClass;
	}
	@Override
	public EReference getWaitingClientQueue_Clients() {
		return waitingClientQueue_clientsEReference;	
	}
	@Override
	public EClass getConnectionData() {
		return connectionDataEClass;
	}
	@Override
	public EAttribute getConnectionData_ServerId() {
		return connectionData_serverIdEAttribute;	
	}
	@Override
	public EAttribute getConnectionData_ClientId() {
		return connectionData_clientIdEAttribute;	
	}
	@Override
	public EAttribute getConnectionData_Bandwidth() {
		return connectionData_bandwidthEAttribute;	
	}
	@Override
	public EClass getClientContainer() {
		return clientContainerEClass;
	}
	@Override
	public EReference getClientContainer_Connections() {
		return clientContainer_connectionsEReference;	
	}
	@Override
	public EReference getClientContainer_Nodes() {
		return clientContainer_nodesEReference;	
	}
	@Override
	public EReference getClientContainer_ConnectionData() {
		return clientContainer_connectionDataEReference;	
	}
	@Override
	public EClass getTime() {
		return timeEClass;
	}
	@Override
	public EAttribute getTime_Current() {
		return time_currentEAttribute;	
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LectureStudioModel.LectureStudioModelFactory getLectureStudioModelFactory() {
		return (LectureStudioModel.LectureStudioModelFactory) getEFactoryInstance();
	}

	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__NETWORKS);
		root_networksEReference = (EReference) rootEClass.getEStructuralFeatures().get(0);
		createEAttribute(rootEClass, ROOT__CLOCK);
		root_clockEAttribute = (EAttribute) rootEClass.getEStructuralFeatures().get(1);
		createEReference(rootEClass, ROOT__TIME);
		root_timeEReference = (EReference) rootEClass.getEStructuralFeatures().get(2);
		
		networkEClass = createEClass(NETWORK);
		createEReference(networkEClass, NETWORK__LECTURE_STUDIO_SERVER);
		network_lectureStudioServerEReference = (EReference) networkEClass.getEStructuralFeatures().get(0);
		
		lectureStudioServerEClass = createEClass(LECTURE_STUDIO_SERVER);
		createEReference(lectureStudioServerEClass, LECTURE_STUDIO_SERVER__SERVER);
		lectureStudioServer_serverEReference = (EReference) lectureStudioServerEClass.getEStructuralFeatures().get(0);
		createEReference(lectureStudioServerEClass, LECTURE_STUDIO_SERVER__WAITING_CLIENTS);
		lectureStudioServer_waitingClientsEReference = (EReference) lectureStudioServerEClass.getEStructuralFeatures().get(1);
		createEReference(lectureStudioServerEClass, LECTURE_STUDIO_SERVER__CLIENT_CONTAINER);
		lectureStudioServer_clientContainerEReference = (EReference) lectureStudioServerEClass.getEStructuralFeatures().get(2);
		
		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__SEND_BANDWIDTH);
		node_sendBandwidthEAttribute = (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
		createEAttribute(nodeEClass, NODE__RECEIVE_BANDWIDTH);
		node_receiveBandwidthEAttribute = (EAttribute) nodeEClass.getEStructuralFeatures().get(1);
		createEReference(nodeEClass, NODE__DATA);
		node_dataEReference = (EReference) nodeEClass.getEStructuralFeatures().get(2);
		createEReference(nodeEClass, NODE__SERVER_CONNECTION);
		node_serverConnectionEReference = (EReference) nodeEClass.getEStructuralFeatures().get(3);
		createEReference(nodeEClass, NODE__CLIENT_CONNECTION);
		node_clientConnectionEReference = (EReference) nodeEClass.getEStructuralFeatures().get(4);
		createEAttribute(nodeEClass, NODE__ID);
		node_idEAttribute = (EAttribute) nodeEClass.getEStructuralFeatures().get(5);
		createEAttribute(nodeEClass, NODE__IS_RELAY_CLIENT);
		node_isRelayClientEAttribute = (EAttribute) nodeEClass.getEStructuralFeatures().get(6);
		createEAttribute(nodeEClass, NODE__CLOCK);
		node_clockEAttribute = (EAttribute) nodeEClass.getEStructuralFeatures().get(7);
		createEAttribute(nodeEClass, NODE__TRANSFERRED_DATA);
		node_transferredDataEAttribute = (EAttribute) nodeEClass.getEStructuralFeatures().get(8);
		
		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__SIZE);
		data_sizeEAttribute = (EAttribute) dataEClass.getEStructuralFeatures().get(0);
		
		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__SERVER);
		connection_serverEReference = (EReference) connectionEClass.getEStructuralFeatures().get(0);
		createEReference(connectionEClass, CONNECTION__CLIENT);
		connection_clientEReference = (EReference) connectionEClass.getEStructuralFeatures().get(1);
		createEAttribute(connectionEClass, CONNECTION__TRANSFER_RATE);
		connection_transferRateEAttribute = (EAttribute) connectionEClass.getEStructuralFeatures().get(2);
		
		waitingClientQueueEClass = createEClass(WAITING_CLIENT_QUEUE);
		createEReference(waitingClientQueueEClass, WAITING_CLIENT_QUEUE__CLIENTS);
		waitingClientQueue_clientsEReference = (EReference) waitingClientQueueEClass.getEStructuralFeatures().get(0);
		
		connectionDataEClass = createEClass(CONNECTION_DATA);
		createEAttribute(connectionDataEClass, CONNECTION_DATA__SERVER_ID);
		connectionData_serverIdEAttribute = (EAttribute) connectionDataEClass.getEStructuralFeatures().get(0);
		createEAttribute(connectionDataEClass, CONNECTION_DATA__CLIENT_ID);
		connectionData_clientIdEAttribute = (EAttribute) connectionDataEClass.getEStructuralFeatures().get(1);
		createEAttribute(connectionDataEClass, CONNECTION_DATA__BANDWIDTH);
		connectionData_bandwidthEAttribute = (EAttribute) connectionDataEClass.getEStructuralFeatures().get(2);
		
		clientContainerEClass = createEClass(CLIENT_CONTAINER);
		createEReference(clientContainerEClass, CLIENT_CONTAINER__CONNECTIONS);
		clientContainer_connectionsEReference = (EReference) clientContainerEClass.getEStructuralFeatures().get(0);
		createEReference(clientContainerEClass, CLIENT_CONTAINER__NODES);
		clientContainer_nodesEReference = (EReference) clientContainerEClass.getEStructuralFeatures().get(1);
		createEReference(clientContainerEClass, CLIENT_CONTAINER__CONNECTION_DATA);
		clientContainer_connectionDataEReference = (EReference) clientContainerEClass.getEStructuralFeatures().get(2);
		
		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__CURRENT);
		time_currentEAttribute = (EAttribute) timeEClass.getEStructuralFeatures().get(0);
		
		// Create enums
		
		// Create data types
	}

	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);
		
		// Obtain other dependent packages

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Networks(), this.getNetwork(),  null, 
			"networks", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoot_Clock(), ecorePackage.getEDouble(),
			"clock", "0.0", 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Time(), this.getTime(),  null, 
			"time", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetwork_LectureStudioServer(), this.getLectureStudioServer(),  null, 
			"lectureStudioServer", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(lectureStudioServerEClass, LectureStudioServer.class, "LectureStudioServer", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLectureStudioServer_Server(), this.getNode(),  null, 
			"server", null, 0, 1, LectureStudioServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLectureStudioServer_WaitingClients(), this.getWaitingClientQueue(),  null, 
			"waitingClients", null, 0, 1, LectureStudioServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLectureStudioServer_ClientContainer(), this.getClientContainer(),  null, 
			"clientContainer", null, 0, 1, LectureStudioServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_SendBandwidth(), ecorePackage.getEDouble(),
			"sendBandwidth", "0.0", 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_ReceiveBandwidth(), ecorePackage.getEDouble(),
			"receiveBandwidth", "0.0", 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Data(), this.getData(),  null, 
			"data", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ServerConnection(), this.getConnection(), this.getConnection_Client(), 
			"serverConnection", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ClientConnection(), this.getConnection(), this.getConnection_Server(), 
			"clientConnection", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Id(), ecorePackage.getEString(),
			"id", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_IsRelayClient(), ecorePackage.getEBoolean(),
			"isRelayClient", "false", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Clock(), ecorePackage.getEDouble(),
			"clock", "0.0", 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_TransferredData(), ecorePackage.getEDouble(),
			"transferredData", "0.0", 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Size(), ecorePackage.getEDouble(),
			"size", "0.0", 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Server(), this.getNode(), this.getNode_ClientConnection(), 
			"server", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Client(), this.getNode(), this.getNode_ServerConnection(), 
			"client", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_TransferRate(), ecorePackage.getEDouble(),
			"transferRate", "0.0", 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(waitingClientQueueEClass, WaitingClientQueue.class, "WaitingClientQueue", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaitingClientQueue_Clients(), this.getNode(),  null, 
			"clients", null, 0, -1, WaitingClientQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(connectionDataEClass, ConnectionData.class, "ConnectionData", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionData_ServerId(), ecorePackage.getEString(),
			"serverId", null, 0, 1, ConnectionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionData_ClientId(), ecorePackage.getEString(),
			"clientId", null, 0, 1, ConnectionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionData_Bandwidth(), ecorePackage.getEDouble(),
			"bandwidth", "0.0", 0, -1, ConnectionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(clientContainerEClass, ClientContainer.class, "ClientContainer", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClientContainer_Connections(), this.getConnection(),  null, 
			"connections", null, 0, -1, ClientContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClientContainer_Nodes(), this.getNode(),  null, 
			"nodes", null, 0, -1, ClientContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClientContainer_ConnectionData(), this.getConnectionData(),  null, 
			"connectionData", null, 0, -1, ClientContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Current(), ecorePackage.getEDouble(),
			"current", "0.0", 0, -1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		
		// Initialize enums and add enum literals
		
		// Initialize data types
		
		// Create resource
		createResource(eNS_URI);
	}

} 

