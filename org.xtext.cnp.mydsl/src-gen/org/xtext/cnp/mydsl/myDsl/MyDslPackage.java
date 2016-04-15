/**
 */
package org.xtext.cnp.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.cnp.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/cnp/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Agent Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AGENT_ATTRIBUTES = 0;

  /**
   * The feature id for the '<em><b>Task Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TASK_ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Bid Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BID_ATTRIBUTES = 2;

  /**
   * The feature id for the '<em><b>Contract Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONTRACT_ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>Organizational Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ORGANIZATIONAL_MODEL = 4;

  /**
   * The feature id for the '<em><b>Tasks Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TASKS_MODEL = 5;

  /**
   * The feature id for the '<em><b>Contract Net Protocols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONTRACT_NET_PROTOCOLS = 6;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.AbstractTypeImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAbstractType()
   * @generated
   */
  int ABSTRACT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>List Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE__LIST_TYPE = 1;

  /**
   * The number of structural features of the '<em>Abstract Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ClassAttributesImpl <em>Class Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ClassAttributesImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getClassAttributes()
   * @generated
   */
  int CLASS_ATTRIBUTES = 2;

  /**
   * The feature id for the '<em><b>Agent Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATTRIBUTES__AGENT_ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Class Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATTRIBUTES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.OrganizationalModelImpl <em>Organizational Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.OrganizationalModelImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getOrganizationalModel()
   * @generated
   */
  int ORGANIZATIONAL_MODEL = 3;

  /**
   * The feature id for the '<em><b>Agents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONAL_MODEL__AGENTS = 0;

  /**
   * The number of structural features of the '<em>Organizational Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONAL_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AgentImpl <em>Agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.AgentImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAgent()
   * @generated
   */
  int AGENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__ATTRIBUTE_VALUES = 1;

  /**
   * The number of structural features of the '<em>Agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.TasksModelImpl <em>Tasks Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.TasksModelImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getTasksModel()
   * @generated
   */
  int TASKS_MODEL = 5;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_MODEL__TASKS = 0;

  /**
   * The number of structural features of the '<em>Tasks Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.TaskImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getTask()
   * @generated
   */
  int TASK = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ATTRIBUTE_VALUES = 1;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ContractNetProtocolImpl <em>Contract Net Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ContractNetProtocolImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getContractNetProtocol()
   * @generated
   */
  int CONTRACT_NET_PROTOCOL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_NET_PROTOCOL__NAME = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_NET_PROTOCOL__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Role Behavior</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_NET_PROTOCOL__ROLE_BEHAVIOR = 2;

  /**
   * The number of structural features of the '<em>Contract Net Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_NET_PROTOCOL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl <em>Role Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getRoleBehavior()
   * @generated
   */
  int ROLE_BEHAVIOR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR__STATES = 2;

  /**
   * The feature id for the '<em><b>Start State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR__START_STATE = 3;

  /**
   * The feature id for the '<em><b>End State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR__END_STATE = 4;

  /**
   * The number of structural features of the '<em>Role Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.AttributeImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DEFAULT = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.AttributeValueImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAttributeValue()
   * @generated
   */
  int ATTRIBUTE_VALUE = 10;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.VariableDeclarationImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.VariableImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE = VARIABLE_DECLARATION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VALUE = VARIABLE_DECLARATION__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ActionImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
   * @generated
   */
  int ACTION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__INPUTS = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.StateImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getState()
   * @generated
   */
  int STATE = 14;

  /**
   * The feature id for the '<em><b>Background State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__BACKGROUND_STATE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__VARIABLES = 2;

  /**
   * The feature id for the '<em><b>Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ACTIVITIES = 3;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 15;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__IF = 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__THEN = 2;

  /**
   * The feature id for the '<em><b>Elseif</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ELSEIF = 3;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ELSE = 4;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.OperatorImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 16;

  /**
   * The feature id for the '<em><b>Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__EQUAL_TO = 0;

  /**
   * The feature id for the '<em><b>Larger Than</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__LARGER_THAN = 1;

  /**
   * The feature id for the '<em><b>Smaller Than</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__SMALLER_THAN = 2;

  /**
   * The feature id for the '<em><b>Larger Or Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__LARGER_OR_EQUAL_TO = 3;

  /**
   * The feature id for the '<em><b>Smaller Or Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__SMALLER_OR_EQUAL_TO = 4;

  /**
   * The feature id for the '<em><b>Not Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__NOT_EQUAL_TO = 5;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ConditionImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 17;

  /**
   * The feature id for the '<em><b>Subjective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__SUBJECTIVE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Objective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OBJECTIVE = 2;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__AND = 3;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OR = 4;

  /**
   * The feature id for the '<em><b>Compare Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COMPARE_CONDITION = 5;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.StatementImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Is Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IS_ACTION = 0;

  /**
   * The feature id for the '<em><b>Action Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ACTION_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Is Change State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IS_CHANGE_STATE = 2;

  /**
   * The feature id for the '<em><b>Change State Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CHANGE_STATE_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Assert Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ASSERT_STATEMENT = 4;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ActionStatementImpl <em>Action Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ActionStatementImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getActionStatement()
   * @generated
   */
  int ACTION_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__ACTION = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__INPUTS = 1;

  /**
   * The number of structural features of the '<em>Action Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.AssertStatementImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAssertStatement()
   * @generated
   */
  int ASSERT_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_STATEMENT__INPUT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_STATEMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Assert Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ChangeStateStatementImpl <em>Change State Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ChangeStateStatementImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getChangeStateStatement()
   * @generated
   */
  int CHANGE_STATE_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>Target State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_STATE_STATEMENT__TARGET_STATE = 0;

  /**
   * The number of structural features of the '<em>Change State Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_STATE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.ExpressionImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 22;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.TermImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getTerm()
   * @generated
   */
  int TERM = 23;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.FactorImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 24;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__NUMBER = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__VARIABLE = TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__STRING = TERM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__BOOLEAN = TERM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__EXPRESSION = TERM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.PlusImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.MinusImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.MultiplyImpl <em>Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.MultiplyImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getMultiply()
   * @generated
   */
  int MULTIPLY = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__LEFT = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__RIGHT = TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.cnp.mydsl.myDsl.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cnp.mydsl.myDsl.impl.DivisionImpl
   * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Model#getAgentAttributes <em>Agent Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Agent Attributes</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Model#getAgentAttributes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_AgentAttributes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Model#getTaskAttributes <em>Task Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Task Attributes</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Model#getTaskAttributes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_TaskAttributes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Model#getBidAttributes <em>Bid Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bid Attributes</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Model#getBidAttributes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_BidAttributes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Model#getContractAttributes <em>Contract Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contract Attributes</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Model#getContractAttributes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ContractAttributes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Model#getOrganizationalModel <em>Organizational Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Organizational Model</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Model#getOrganizationalModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_OrganizationalModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Model#getTasksModel <em>Tasks Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tasks Model</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Model#getTasksModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_TasksModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.Model#getContractNetProtocols <em>Contract Net Protocols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contract Net Protocols</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Model#getContractNetProtocols()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ContractNetProtocols();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.AbstractType <em>Abstract Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Type</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AbstractType
   * @generated
   */
  EClass getAbstractType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.AbstractType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AbstractType#getType()
   * @see #getAbstractType()
   * @generated
   */
  EAttribute getAbstractType_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.AbstractType#isListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Type</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AbstractType#isListType()
   * @see #getAbstractType()
   * @generated
   */
  EAttribute getAbstractType_ListType();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.ClassAttributes <em>Class Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Attributes</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ClassAttributes
   * @generated
   */
  EClass getClassAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.ClassAttributes#getAgentAttributes <em>Agent Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agent Attributes</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ClassAttributes#getAgentAttributes()
   * @see #getClassAttributes()
   * @generated
   */
  EReference getClassAttributes_AgentAttributes();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.OrganizationalModel <em>Organizational Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organizational Model</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.OrganizationalModel
   * @generated
   */
  EClass getOrganizationalModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.OrganizationalModel#getAgents <em>Agents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agents</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.OrganizationalModel#getAgents()
   * @see #getOrganizationalModel()
   * @generated
   */
  EReference getOrganizationalModel_Agents();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Agent
   * @generated
   */
  EClass getAgent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Agent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Agent#getName()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.Agent#getAttributeValues <em>Attribute Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Values</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Agent#getAttributeValues()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_AttributeValues();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.TasksModel <em>Tasks Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tasks Model</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.TasksModel
   * @generated
   */
  EClass getTasksModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.TasksModel#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.TasksModel#getTasks()
   * @see #getTasksModel()
   * @generated
   */
  EReference getTasksModel_Tasks();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.Task#getAttributeValues <em>Attribute Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Values</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Task#getAttributeValues()
   * @see #getTask()
   * @generated
   */
  EReference getTask_AttributeValues();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.ContractNetProtocol <em>Contract Net Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contract Net Protocol</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ContractNetProtocol
   * @generated
   */
  EClass getContractNetProtocol();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.ContractNetProtocol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ContractNetProtocol#getName()
   * @see #getContractNetProtocol()
   * @generated
   */
  EAttribute getContractNetProtocol_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.ContractNetProtocol#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ContractNetProtocol#getVariables()
   * @see #getContractNetProtocol()
   * @generated
   */
  EReference getContractNetProtocol_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.ContractNetProtocol#getRoleBehavior <em>Role Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Role Behavior</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ContractNetProtocol#getRoleBehavior()
   * @see #getContractNetProtocol()
   * @generated
   */
  EReference getContractNetProtocol_RoleBehavior();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior <em>Role Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Behavior</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.RoleBehavior
   * @generated
   */
  EClass getRoleBehavior();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.RoleBehavior#getName()
   * @see #getRoleBehavior()
   * @generated
   */
  EAttribute getRoleBehavior_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.RoleBehavior#getActions()
   * @see #getRoleBehavior()
   * @generated
   */
  EReference getRoleBehavior_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.RoleBehavior#getStates()
   * @see #getRoleBehavior()
   * @generated
   */
  EReference getRoleBehavior_States();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getStartState <em>Start State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Start State</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.RoleBehavior#getStartState()
   * @see #getRoleBehavior()
   * @generated
   */
  EReference getRoleBehavior_StartState();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getEndState <em>End State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>End State</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.RoleBehavior#getEndState()
   * @see #getRoleBehavior()
   * @generated
   */
  EReference getRoleBehavior_EndState();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Attribute#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Attribute#getDefault()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Default();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AttributeValue
   * @generated
   */
  EClass getAttributeValue();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cnp.mydsl.myDsl.AttributeValue#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AttributeValue#getAttribute()
   * @see #getAttributeValue()
   * @generated
   */
  EReference getAttributeValue_Attribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.AttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AttributeValue#getValue()
   * @see #getAttributeValue()
   * @generated
   */
  EAttribute getAttributeValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.VariableDeclaration#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.VariableDeclaration#getVariable()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.VariableDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.VariableDeclaration#getValue()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.Action#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Action#getInputs()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Inputs();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.State#isBackgroundState <em>Background State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background State</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.State#isBackgroundState()
   * @see #getState()
   * @generated
   */
  EAttribute getState_BackgroundState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.State#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.State#getVariables()
   * @see #getState()
   * @generated
   */
  EReference getState_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.State#getActivities <em>Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activities</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.State#getActivities()
   * @see #getState()
   * @generated
   */
  EReference getState_Activities();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.Activity#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Activity#getDeclarations()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Declarations();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Activity#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Activity#getIf()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_If();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.Activity#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Activity#getThen()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Activity#getElseif <em>Elseif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elseif</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Activity#getElseif()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Elseif();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cnp.mydsl.myDsl.Activity#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Activity#getElse()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Else();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Operator#isEqualTo <em>Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Equal To</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Operator#isEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_EqualTo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Operator#isLargerThan <em>Larger Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Larger Than</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Operator#isLargerThan()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_LargerThan();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Operator#isSmallerThan <em>Smaller Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Smaller Than</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Operator#isSmallerThan()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_SmallerThan();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Operator#isLargerOrEqualTo <em>Larger Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Larger Or Equal To</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Operator#isLargerOrEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_LargerOrEqualTo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Operator#isSmallerOrEqualTo <em>Smaller Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Smaller Or Equal To</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Operator#isSmallerOrEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_SmallerOrEqualTo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Operator#isNotEqualTo <em>Not Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Equal To</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Operator#isNotEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_NotEqualTo();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Condition#getSubjective <em>Subjective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subjective</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Condition#getSubjective()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Subjective();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Condition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Condition#getOperator()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Condition#getObjective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Objective</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Condition#getObjective()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Objective();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Condition#isAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Condition#isAnd()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_And();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Condition#isOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Condition#isOr()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Or();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Condition#getCompareCondition <em>Compare Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compare Condition</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Condition#getCompareCondition()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_CompareCondition();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Statement#isIsAction <em>Is Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Action</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Statement#isIsAction()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_IsAction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Statement#getActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action Statement</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Statement#getActionStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ActionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Statement#isIsChangeState <em>Is Change State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Change State</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Statement#isIsChangeState()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_IsChangeState();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Statement#getChangeStateStatement <em>Change State Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Change State Statement</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Statement#getChangeStateStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ChangeStateStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Statement#getAssertStatement <em>Assert Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Statement</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Statement#getAssertStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_AssertStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Statement</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ActionStatement
   * @generated
   */
  EClass getActionStatement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cnp.mydsl.myDsl.ActionStatement#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ActionStatement#getAction()
   * @see #getActionStatement()
   * @generated
   */
  EReference getActionStatement_Action();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.cnp.mydsl.myDsl.ActionStatement#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Inputs</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ActionStatement#getInputs()
   * @see #getActionStatement()
   * @generated
   */
  EAttribute getActionStatement_Inputs();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.AssertStatement <em>Assert Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert Statement</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AssertStatement
   * @generated
   */
  EClass getAssertStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.AssertStatement#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AssertStatement#getInput()
   * @see #getAssertStatement()
   * @generated
   */
  EAttribute getAssertStatement_Input();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.AssertStatement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.AssertStatement#getValue()
   * @see #getAssertStatement()
   * @generated
   */
  EReference getAssertStatement_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.ChangeStateStatement <em>Change State Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Change State Statement</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ChangeStateStatement
   * @generated
   */
  EClass getChangeStateStatement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cnp.mydsl.myDsl.ChangeStateStatement#getTargetState <em>Target State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target State</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.ChangeStateStatement#getTargetState()
   * @see #getChangeStateStatement()
   * @generated
   */
  EReference getChangeStateStatement_TargetState();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Factor#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Factor#getNumber()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Factor#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Factor#getVariable()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Factor#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Factor#getString()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_String();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cnp.mydsl.myDsl.Factor#isBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Factor#isBoolean()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Boolean();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Factor#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Factor#getExpression()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiply</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Multiply
   * @generated
   */
  EClass getMultiply();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Multiply#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Multiply#getLeft()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Multiply#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Multiply#getRight()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.cnp.mydsl.myDsl.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cnp.mydsl.myDsl.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.cnp.mydsl.myDsl.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Agent Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__AGENT_ATTRIBUTES = eINSTANCE.getModel_AgentAttributes();

    /**
     * The meta object literal for the '<em><b>Task Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TASK_ATTRIBUTES = eINSTANCE.getModel_TaskAttributes();

    /**
     * The meta object literal for the '<em><b>Bid Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BID_ATTRIBUTES = eINSTANCE.getModel_BidAttributes();

    /**
     * The meta object literal for the '<em><b>Contract Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONTRACT_ATTRIBUTES = eINSTANCE.getModel_ContractAttributes();

    /**
     * The meta object literal for the '<em><b>Organizational Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ORGANIZATIONAL_MODEL = eINSTANCE.getModel_OrganizationalModel();

    /**
     * The meta object literal for the '<em><b>Tasks Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TASKS_MODEL = eINSTANCE.getModel_TasksModel();

    /**
     * The meta object literal for the '<em><b>Contract Net Protocols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONTRACT_NET_PROTOCOLS = eINSTANCE.getModel_ContractNetProtocols();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.AbstractTypeImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAbstractType()
     * @generated
     */
    EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TYPE__TYPE = eINSTANCE.getAbstractType_Type();

    /**
     * The meta object literal for the '<em><b>List Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TYPE__LIST_TYPE = eINSTANCE.getAbstractType_ListType();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ClassAttributesImpl <em>Class Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ClassAttributesImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getClassAttributes()
     * @generated
     */
    EClass CLASS_ATTRIBUTES = eINSTANCE.getClassAttributes();

    /**
     * The meta object literal for the '<em><b>Agent Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_ATTRIBUTES__AGENT_ATTRIBUTES = eINSTANCE.getClassAttributes_AgentAttributes();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.OrganizationalModelImpl <em>Organizational Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.OrganizationalModelImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getOrganizationalModel()
     * @generated
     */
    EClass ORGANIZATIONAL_MODEL = eINSTANCE.getOrganizationalModel();

    /**
     * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATIONAL_MODEL__AGENTS = eINSTANCE.getOrganizationalModel_Agents();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AgentImpl <em>Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.AgentImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAgent()
     * @generated
     */
    EClass AGENT = eINSTANCE.getAgent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

    /**
     * The meta object literal for the '<em><b>Attribute Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__ATTRIBUTE_VALUES = eINSTANCE.getAgent_AttributeValues();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.TasksModelImpl <em>Tasks Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.TasksModelImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getTasksModel()
     * @generated
     */
    EClass TASKS_MODEL = eINSTANCE.getTasksModel();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASKS_MODEL__TASKS = eINSTANCE.getTasksModel_Tasks();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.TaskImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Attribute Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ATTRIBUTE_VALUES = eINSTANCE.getTask_AttributeValues();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ContractNetProtocolImpl <em>Contract Net Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ContractNetProtocolImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getContractNetProtocol()
     * @generated
     */
    EClass CONTRACT_NET_PROTOCOL = eINSTANCE.getContractNetProtocol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACT_NET_PROTOCOL__NAME = eINSTANCE.getContractNetProtocol_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_NET_PROTOCOL__VARIABLES = eINSTANCE.getContractNetProtocol_Variables();

    /**
     * The meta object literal for the '<em><b>Role Behavior</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_NET_PROTOCOL__ROLE_BEHAVIOR = eINSTANCE.getContractNetProtocol_RoleBehavior();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl <em>Role Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getRoleBehavior()
     * @generated
     */
    EClass ROLE_BEHAVIOR = eINSTANCE.getRoleBehavior();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_BEHAVIOR__NAME = eINSTANCE.getRoleBehavior_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_BEHAVIOR__ACTIONS = eINSTANCE.getRoleBehavior_Actions();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_BEHAVIOR__STATES = eINSTANCE.getRoleBehavior_States();

    /**
     * The meta object literal for the '<em><b>Start State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_BEHAVIOR__START_STATE = eINSTANCE.getRoleBehavior_StartState();

    /**
     * The meta object literal for the '<em><b>End State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_BEHAVIOR__END_STATE = eINSTANCE.getRoleBehavior_EndState();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.AttributeImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.AttributeValueImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAttributeValue()
     * @generated
     */
    EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_VALUE__ATTRIBUTE = eINSTANCE.getAttributeValue_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_VALUE__VALUE = eINSTANCE.getAttributeValue_Value();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.VariableImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.VariableDeclarationImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VARIABLE = eINSTANCE.getVariableDeclaration_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VALUE = eINSTANCE.getVariableDeclaration_Value();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ActionImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__INPUTS = eINSTANCE.getAction_Inputs();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.StateImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Background State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__BACKGROUND_STATE = eINSTANCE.getState_BackgroundState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__VARIABLES = eINSTANCE.getState_Variables();

    /**
     * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ACTIVITIES = eINSTANCE.getState_Activities();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__DECLARATIONS = eINSTANCE.getActivity_Declarations();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__IF = eINSTANCE.getActivity_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__THEN = eINSTANCE.getActivity_Then();

    /**
     * The meta object literal for the '<em><b>Elseif</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ELSEIF = eINSTANCE.getActivity_Elseif();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ELSE = eINSTANCE.getActivity_Else();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.OperatorImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__EQUAL_TO = eINSTANCE.getOperator_EqualTo();

    /**
     * The meta object literal for the '<em><b>Larger Than</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__LARGER_THAN = eINSTANCE.getOperator_LargerThan();

    /**
     * The meta object literal for the '<em><b>Smaller Than</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__SMALLER_THAN = eINSTANCE.getOperator_SmallerThan();

    /**
     * The meta object literal for the '<em><b>Larger Or Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__LARGER_OR_EQUAL_TO = eINSTANCE.getOperator_LargerOrEqualTo();

    /**
     * The meta object literal for the '<em><b>Smaller Or Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__SMALLER_OR_EQUAL_TO = eINSTANCE.getOperator_SmallerOrEqualTo();

    /**
     * The meta object literal for the '<em><b>Not Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__NOT_EQUAL_TO = eINSTANCE.getOperator_NotEqualTo();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ConditionImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Subjective</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__SUBJECTIVE = eINSTANCE.getCondition_Subjective();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Objective</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OBJECTIVE = eINSTANCE.getCondition_Objective();

    /**
     * The meta object literal for the '<em><b>And</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__AND = eINSTANCE.getCondition_And();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OR = eINSTANCE.getCondition_Or();

    /**
     * The meta object literal for the '<em><b>Compare Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__COMPARE_CONDITION = eINSTANCE.getCondition_CompareCondition();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.StatementImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Is Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IS_ACTION = eINSTANCE.getStatement_IsAction();

    /**
     * The meta object literal for the '<em><b>Action Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ACTION_STATEMENT = eINSTANCE.getStatement_ActionStatement();

    /**
     * The meta object literal for the '<em><b>Is Change State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IS_CHANGE_STATE = eINSTANCE.getStatement_IsChangeState();

    /**
     * The meta object literal for the '<em><b>Change State Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CHANGE_STATE_STATEMENT = eINSTANCE.getStatement_ChangeStateStatement();

    /**
     * The meta object literal for the '<em><b>Assert Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ASSERT_STATEMENT = eINSTANCE.getStatement_AssertStatement();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ActionStatementImpl <em>Action Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ActionStatementImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getActionStatement()
     * @generated
     */
    EClass ACTION_STATEMENT = eINSTANCE.getActionStatement();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_STATEMENT__ACTION = eINSTANCE.getActionStatement_Action();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_STATEMENT__INPUTS = eINSTANCE.getActionStatement_Inputs();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.AssertStatementImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getAssertStatement()
     * @generated
     */
    EClass ASSERT_STATEMENT = eINSTANCE.getAssertStatement();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERT_STATEMENT__INPUT = eINSTANCE.getAssertStatement_Input();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT_STATEMENT__VALUE = eINSTANCE.getAssertStatement_Value();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ChangeStateStatementImpl <em>Change State Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ChangeStateStatementImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getChangeStateStatement()
     * @generated
     */
    EClass CHANGE_STATE_STATEMENT = eINSTANCE.getChangeStateStatement();

    /**
     * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGE_STATE_STATEMENT__TARGET_STATE = eINSTANCE.getChangeStateStatement_TargetState();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.ExpressionImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.TermImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.FactorImpl <em>Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.FactorImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getFactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__NUMBER = eINSTANCE.getFactor_Number();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__VARIABLE = eINSTANCE.getFactor_Variable();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__STRING = eINSTANCE.getFactor_String();

    /**
     * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__BOOLEAN = eINSTANCE.getFactor_Boolean();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__EXPRESSION = eINSTANCE.getFactor_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.PlusImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.MinusImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.MultiplyImpl <em>Multiply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.MultiplyImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getMultiply()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMultiply();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__LEFT = eINSTANCE.getMultiply_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__RIGHT = eINSTANCE.getMultiply_Right();

    /**
     * The meta object literal for the '{@link org.xtext.cnp.mydsl.myDsl.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cnp.mydsl.myDsl.impl.DivisionImpl
     * @see org.xtext.cnp.mydsl.myDsl.impl.MyDslPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

  }

} //MyDslPackage
