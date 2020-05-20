/**
 * generated by Xtext 2.21.0
 */
package workflow.workflowDSL;

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
 * @see workflow.workflowDSL.WorkflowDSLFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "workflowDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.WorkflowDSL.workflow";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "workflowDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WorkflowDSLPackage eINSTANCE = workflow.workflowDSL.impl.WorkflowDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.WFModelImpl <em>WF Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.WFModelImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getWFModel()
   * @generated
   */
  int WF_MODEL = 0;

  /**
   * The feature id for the '<em><b>Workflow</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WF_MODEL__WORKFLOW = 0;

  /**
   * The number of structural features of the '<em>WF Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WF_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.WorkflowImpl <em>Workflow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.WorkflowImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getWorkflow()
   * @generated
   */
  int WORKFLOW = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__NAME = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__BASE = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__STEPS = 3;

  /**
   * The number of structural features of the '<em>Workflow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.StepImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getStep()
   * @generated
   */
  int STEP = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NAME = 0;

  /**
   * The feature id for the '<em><b>Recurring</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__RECURRING = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__PARAMS = 2;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.SourceStepImpl <em>Source Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.SourceStepImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getSourceStep()
   * @generated
   */
  int SOURCE_STEP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_STEP__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Recurring</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_STEP__RECURRING = STEP__RECURRING;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_STEP__PARAMS = STEP__PARAMS;

  /**
   * The feature id for the '<em><b>Write To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_STEP__WRITE_TO = STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Source Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.IntermediateStepImpl <em>Intermediate Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.IntermediateStepImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getIntermediateStep()
   * @generated
   */
  int INTERMEDIATE_STEP = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE_STEP__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Recurring</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE_STEP__RECURRING = STEP__RECURRING;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE_STEP__PARAMS = STEP__PARAMS;

  /**
   * The feature id for the '<em><b>Read From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE_STEP__READ_FROM = STEP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Write To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE_STEP__WRITE_TO = STEP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Intermediate Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERMEDIATE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.SinkStepImpl <em>Sink Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.SinkStepImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getSinkStep()
   * @generated
   */
  int SINK_STEP = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK_STEP__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Recurring</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK_STEP__RECURRING = STEP__RECURRING;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK_STEP__PARAMS = STEP__PARAMS;

  /**
   * The feature id for the '<em><b>Read From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK_STEP__READ_FROM = STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sink Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINK_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.MessageQueueImpl <em>Message Queue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.MessageQueueImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getMessageQueue()
   * @generated
   */
  int MESSAGE_QUEUE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_QUEUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Message Queue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_QUEUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.ParameterImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.ParameterValueTypesImpl <em>Parameter Value Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.ParameterValueTypesImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getParameterValueTypes()
   * @generated
   */
  int PARAMETER_VALUE_TYPES = 8;

  /**
   * The number of structural features of the '<em>Parameter Value Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE_TYPES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.StringTypeImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE__VALUE = PARAMETER_VALUE_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = PARAMETER_VALUE_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.IntTypeImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE__VALUE = PARAMETER_VALUE_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = PARAMETER_VALUE_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.BoolTypeImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE__VALUE = PARAMETER_VALUE_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = PARAMETER_VALUE_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link workflow.workflowDSL.impl.IdentifierImpl <em>Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see workflow.workflowDSL.impl.IdentifierImpl
   * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getIdentifier()
   * @generated
   */
  int IDENTIFIER = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__VALUE = PARAMETER_VALUE_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = PARAMETER_VALUE_TYPES_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.WFModel <em>WF Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WF Model</em>'.
   * @see workflow.workflowDSL.WFModel
   * @generated
   */
  EClass getWFModel();

  /**
   * Returns the meta object for the containment reference list '{@link workflow.workflowDSL.WFModel#getWorkflow <em>Workflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Workflow</em>'.
   * @see workflow.workflowDSL.WFModel#getWorkflow()
   * @see #getWFModel()
   * @generated
   */
  EReference getWFModel_Workflow();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.Workflow <em>Workflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow</em>'.
   * @see workflow.workflowDSL.Workflow
   * @generated
   */
  EClass getWorkflow();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.Workflow#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see workflow.workflowDSL.Workflow#getName()
   * @see #getWorkflow()
   * @generated
   */
  EAttribute getWorkflow_Name();

  /**
   * Returns the meta object for the reference '{@link workflow.workflowDSL.Workflow#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base</em>'.
   * @see workflow.workflowDSL.Workflow#getBase()
   * @see #getWorkflow()
   * @generated
   */
  EReference getWorkflow_Base();

  /**
   * Returns the meta object for the containment reference list '{@link workflow.workflowDSL.Workflow#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see workflow.workflowDSL.Workflow#getParams()
   * @see #getWorkflow()
   * @generated
   */
  EReference getWorkflow_Params();

  /**
   * Returns the meta object for the containment reference list '{@link workflow.workflowDSL.Workflow#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see workflow.workflowDSL.Workflow#getSteps()
   * @see #getWorkflow()
   * @generated
   */
  EReference getWorkflow_Steps();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see workflow.workflowDSL.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.Step#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see workflow.workflowDSL.Step#getName()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Name();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.Step#isRecurring <em>Recurring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recurring</em>'.
   * @see workflow.workflowDSL.Step#isRecurring()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Recurring();

  /**
   * Returns the meta object for the containment reference list '{@link workflow.workflowDSL.Step#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see workflow.workflowDSL.Step#getParams()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Params();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.SourceStep <em>Source Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Step</em>'.
   * @see workflow.workflowDSL.SourceStep
   * @generated
   */
  EClass getSourceStep();

  /**
   * Returns the meta object for the containment reference '{@link workflow.workflowDSL.SourceStep#getWriteTo <em>Write To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Write To</em>'.
   * @see workflow.workflowDSL.SourceStep#getWriteTo()
   * @see #getSourceStep()
   * @generated
   */
  EReference getSourceStep_WriteTo();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.IntermediateStep <em>Intermediate Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intermediate Step</em>'.
   * @see workflow.workflowDSL.IntermediateStep
   * @generated
   */
  EClass getIntermediateStep();

  /**
   * Returns the meta object for the containment reference '{@link workflow.workflowDSL.IntermediateStep#getReadFrom <em>Read From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Read From</em>'.
   * @see workflow.workflowDSL.IntermediateStep#getReadFrom()
   * @see #getIntermediateStep()
   * @generated
   */
  EReference getIntermediateStep_ReadFrom();

  /**
   * Returns the meta object for the containment reference '{@link workflow.workflowDSL.IntermediateStep#getWriteTo <em>Write To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Write To</em>'.
   * @see workflow.workflowDSL.IntermediateStep#getWriteTo()
   * @see #getIntermediateStep()
   * @generated
   */
  EReference getIntermediateStep_WriteTo();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.SinkStep <em>Sink Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sink Step</em>'.
   * @see workflow.workflowDSL.SinkStep
   * @generated
   */
  EClass getSinkStep();

  /**
   * Returns the meta object for the containment reference '{@link workflow.workflowDSL.SinkStep#getReadFrom <em>Read From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Read From</em>'.
   * @see workflow.workflowDSL.SinkStep#getReadFrom()
   * @see #getSinkStep()
   * @generated
   */
  EReference getSinkStep_ReadFrom();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.MessageQueue <em>Message Queue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Queue</em>'.
   * @see workflow.workflowDSL.MessageQueue
   * @generated
   */
  EClass getMessageQueue();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.MessageQueue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see workflow.workflowDSL.MessageQueue#getName()
   * @see #getMessageQueue()
   * @generated
   */
  EAttribute getMessageQueue_Name();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see workflow.workflowDSL.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see workflow.workflowDSL.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link workflow.workflowDSL.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see workflow.workflowDSL.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Value();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.ParameterValueTypes <em>Parameter Value Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Value Types</em>'.
   * @see workflow.workflowDSL.ParameterValueTypes
   * @generated
   */
  EClass getParameterValueTypes();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see workflow.workflowDSL.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.StringType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see workflow.workflowDSL.StringType#getValue()
   * @see #getStringType()
   * @generated
   */
  EAttribute getStringType_Value();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see workflow.workflowDSL.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.IntType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see workflow.workflowDSL.IntType#getValue()
   * @see #getIntType()
   * @generated
   */
  EAttribute getIntType_Value();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see workflow.workflowDSL.BoolType
   * @generated
   */
  EClass getBoolType();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.BoolType#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see workflow.workflowDSL.BoolType#isValue()
   * @see #getBoolType()
   * @generated
   */
  EAttribute getBoolType_Value();

  /**
   * Returns the meta object for class '{@link workflow.workflowDSL.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier</em>'.
   * @see workflow.workflowDSL.Identifier
   * @generated
   */
  EClass getIdentifier();

  /**
   * Returns the meta object for the attribute '{@link workflow.workflowDSL.Identifier#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see workflow.workflowDSL.Identifier#getValue()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WorkflowDSLFactory getWorkflowDSLFactory();

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
     * The meta object literal for the '{@link workflow.workflowDSL.impl.WFModelImpl <em>WF Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.WFModelImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getWFModel()
     * @generated
     */
    EClass WF_MODEL = eINSTANCE.getWFModel();

    /**
     * The meta object literal for the '<em><b>Workflow</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WF_MODEL__WORKFLOW = eINSTANCE.getWFModel_Workflow();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.WorkflowImpl <em>Workflow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.WorkflowImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getWorkflow()
     * @generated
     */
    EClass WORKFLOW = eINSTANCE.getWorkflow();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW__BASE = eINSTANCE.getWorkflow_Base();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW__PARAMS = eINSTANCE.getWorkflow_Params();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW__STEPS = eINSTANCE.getWorkflow_Steps();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.StepImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__NAME = eINSTANCE.getStep_Name();

    /**
     * The meta object literal for the '<em><b>Recurring</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__RECURRING = eINSTANCE.getStep_Recurring();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__PARAMS = eINSTANCE.getStep_Params();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.SourceStepImpl <em>Source Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.SourceStepImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getSourceStep()
     * @generated
     */
    EClass SOURCE_STEP = eINSTANCE.getSourceStep();

    /**
     * The meta object literal for the '<em><b>Write To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_STEP__WRITE_TO = eINSTANCE.getSourceStep_WriteTo();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.IntermediateStepImpl <em>Intermediate Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.IntermediateStepImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getIntermediateStep()
     * @generated
     */
    EClass INTERMEDIATE_STEP = eINSTANCE.getIntermediateStep();

    /**
     * The meta object literal for the '<em><b>Read From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERMEDIATE_STEP__READ_FROM = eINSTANCE.getIntermediateStep_ReadFrom();

    /**
     * The meta object literal for the '<em><b>Write To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERMEDIATE_STEP__WRITE_TO = eINSTANCE.getIntermediateStep_WriteTo();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.SinkStepImpl <em>Sink Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.SinkStepImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getSinkStep()
     * @generated
     */
    EClass SINK_STEP = eINSTANCE.getSinkStep();

    /**
     * The meta object literal for the '<em><b>Read From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINK_STEP__READ_FROM = eINSTANCE.getSinkStep_ReadFrom();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.MessageQueueImpl <em>Message Queue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.MessageQueueImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getMessageQueue()
     * @generated
     */
    EClass MESSAGE_QUEUE = eINSTANCE.getMessageQueue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_QUEUE__NAME = eINSTANCE.getMessageQueue_Name();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.ParameterImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.ParameterValueTypesImpl <em>Parameter Value Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.ParameterValueTypesImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getParameterValueTypes()
     * @generated
     */
    EClass PARAMETER_VALUE_TYPES = eINSTANCE.getParameterValueTypes();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.StringTypeImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TYPE__VALUE = eINSTANCE.getStringType_Value();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.IntTypeImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_TYPE__VALUE = eINSTANCE.getIntType_Value();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.BoolTypeImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_TYPE__VALUE = eINSTANCE.getBoolType_Value();

    /**
     * The meta object literal for the '{@link workflow.workflowDSL.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.workflowDSL.impl.IdentifierImpl
     * @see workflow.workflowDSL.impl.WorkflowDSLPackageImpl#getIdentifier()
     * @generated
     */
    EClass IDENTIFIER = eINSTANCE.getIdentifier();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__VALUE = eINSTANCE.getIdentifier_Value();

  }

} //WorkflowDSLPackage
