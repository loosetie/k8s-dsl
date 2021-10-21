package de.loosetie.k8s.dsl

import de.loosetie.k8s.dsl.manifests.*

typealias APIGroup = APIGroup_meta_v1_k8s1_20
typealias APIResource = APIResource_meta_v1_k8s1_20
typealias APIService = APIService_apiregistration_k8s_io_v1_k8s1_20
typealias APIServiceCondition = APIServiceCondition_apiregistration_k8s_io_v1_k8s1_20
typealias APIVersions = APIVersions_meta_v1_k8s1_20
typealias AWSElasticBlockStoreVolumeSource = AWSElasticBlockStoreVolumeSource_core_v1_k8s1_20
typealias Affinity = Affinity_core_v1_k8s1_20
typealias AggregationRule = AggregationRule_rbac_authorization_k8s_io_v1_k8s1_20
typealias AllowedCSIDriver = AllowedCSIDriver_policy_v1beta1_k8s1_20
typealias AllowedFlexVolume = AllowedFlexVolume_policy_v1beta1_k8s1_20
typealias AllowedHostPath = AllowedHostPath_policy_v1beta1_k8s1_20
typealias Apiservicespec = Apiservicespec_apiregistration_k8s_io_v1_k8s1_20
typealias Apiservicestatus = Apiservicestatus_apiregistration_k8s_io_v1_k8s1_20
typealias AttachedVolume = AttachedVolume_core_v1_k8s1_20
typealias AzureDiskVolumeSource = AzureDiskVolumeSource_core_v1_k8s1_20
typealias AzureFilePersistentVolumeSource = AzureFilePersistentVolumeSource_core_v1_k8s1_20
typealias AzureFileVolumeSource = AzureFileVolumeSource_core_v1_k8s1_20
typealias Binding = Binding_core_v1_k8s1_20
typealias BoundObjectReference = BoundObjectReference_authentication_k8s_io_v1_k8s1_20
typealias CSIDriver = CSIDriver_storage_k8s_io_v1_k8s1_20
typealias CSINode = CSINode_storage_k8s_io_v1_k8s1_20
typealias CSINodeDriver = CSINodeDriver_storage_k8s_io_v1_k8s1_20
typealias CSIPersistentVolumeSource = CSIPersistentVolumeSource_core_v1_k8s1_20
typealias CSIVolumeSource = CSIVolumeSource_core_v1_k8s1_20
typealias Capabilities = Capabilities_core_v1_k8s1_20
typealias CephFSPersistentVolumeSource = CephFSPersistentVolumeSource_core_v1_k8s1_20
typealias CephFSVolumeSource = CephFSVolumeSource_core_v1_k8s1_20
typealias CertificateSigningRequest = CertificateSigningRequest_certificates_k8s_io_v1_k8s1_20
typealias CertificateSigningRequestCondition = CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_20
typealias Certificatesigningrequestspec = Certificatesigningrequestspec_certificates_k8s_io_v1_k8s1_20
typealias Certificatesigningrequeststatus = Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_20
typealias CinderPersistentVolumeSource = CinderPersistentVolumeSource_core_v1_k8s1_20
typealias CinderVolumeSource = CinderVolumeSource_core_v1_k8s1_20
typealias ClientIPConfig = ClientIPConfig_core_v1_k8s1_20
typealias ClusterRole = ClusterRole_rbac_authorization_k8s_io_v1_k8s1_20
typealias ClusterRoleBinding = ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_20
typealias ComponentCondition = ComponentCondition_core_v1_k8s1_20
typealias ComponentStatus = ComponentStatus_core_v1_k8s1_20
typealias Condition = Condition_meta_v1_k8s1_20
typealias ConfigMap = ConfigMap_core_v1_k8s1_20
typealias ConfigMapEnvSource = ConfigMapEnvSource_core_v1_k8s1_20
typealias ConfigMapKeySelector = ConfigMapKeySelector_core_v1_k8s1_20
typealias ConfigMapNodeConfigSource = ConfigMapNodeConfigSource_core_v1_k8s1_20
typealias ConfigMapProjection = ConfigMapProjection_core_v1_k8s1_20
typealias ConfigMapVolumeSource = ConfigMapVolumeSource_core_v1_k8s1_20
typealias Container = Container_core_v1_k8s1_20
typealias ContainerImage = ContainerImage_core_v1_k8s1_20
typealias ContainerPort = ContainerPort_core_v1_k8s1_20
typealias ContainerResourceMetricSource = ContainerResourceMetricSource_autoscaling_v2beta2_k8s1_20
typealias ContainerResourceMetricStatus = ContainerResourceMetricStatus_autoscaling_v2beta2_k8s1_20
typealias ContainerState = ContainerState_core_v1_k8s1_20
typealias ContainerStateRunning = ContainerStateRunning_core_v1_k8s1_20
typealias ContainerStateTerminated = ContainerStateTerminated_core_v1_k8s1_20
typealias ContainerStateWaiting = ContainerStateWaiting_core_v1_k8s1_20
typealias Containerstatus = Containerstatus_core_v1_k8s1_20
typealias ControllerRevision = ControllerRevision_apps_v1_k8s1_20
typealias CronJob = CronJob_batch_v1beta1_k8s1_20
typealias Cronjobspec = Cronjobspec_batch_v1beta1_k8s1_20
typealias Cronjobstatus = Cronjobstatus_batch_v1beta1_k8s1_20
typealias CrossVersionObjectReference = CrossVersionObjectReference_autoscaling_v1_k8s1_20
typealias Csidriverspec = Csidriverspec_storage_k8s_io_v1_k8s1_20
typealias Csinodespec = Csinodespec_storage_k8s_io_v1_k8s1_20
typealias CustomResourceColumnDefinition = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceConversion = CustomResourceConversion_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceDefinition = CustomResourceDefinition_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceDefinitionCondition = CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceDefinitionNames = CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceDefinitionVersion = CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceSubresourceScale = CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceSubresourceStatus = CustomResourceSubresourceStatus_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceSubresources = CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_20
typealias CustomResourceValidation = CustomResourceValidation_apiextensions_k8s_io_v1_k8s1_20
typealias Customresourcedefinitionspec = Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_20
typealias Customresourcedefinitionstatus = Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_20
typealias DaemonEndpoint = DaemonEndpoint_core_v1_k8s1_20
typealias DaemonSet = DaemonSet_apps_v1_k8s1_20
typealias DaemonSetCondition = DaemonSetCondition_apps_v1_k8s1_20
typealias DaemonSetUpdateStrategy = DaemonSetUpdateStrategy_apps_v1_k8s1_20
typealias Daemonsetspec = Daemonsetspec_apps_v1_k8s1_20
typealias Daemonsetstatus = Daemonsetstatus_apps_v1_k8s1_20
typealias DeleteOptions = DeleteOptions_meta_v1_k8s1_20
typealias Deployment = Deployment_apps_v1_k8s1_20
typealias DeploymentCondition = DeploymentCondition_apps_v1_k8s1_20
typealias Deploymentspec = Deploymentspec_apps_v1_k8s1_20
typealias Deploymentstatus = Deploymentstatus_apps_v1_k8s1_20
typealias Deploymentstrategy = Deploymentstrategy_apps_v1_k8s1_20
typealias DownwardAPIProjection = DownwardAPIProjection_core_v1_k8s1_20
typealias DownwardAPIVolumeFile = DownwardAPIVolumeFile_core_v1_k8s1_20
typealias DownwardAPIVolumeSource = DownwardAPIVolumeSource_core_v1_k8s1_20
typealias EmptyDirVolumeSource = EmptyDirVolumeSource_core_v1_k8s1_20
typealias Endpoint = Endpoint_discovery_k8s_io_v1beta1_k8s1_20
typealias EndpointAddress = EndpointAddress_core_v1_k8s1_20
typealias EndpointConditions = EndpointConditions_discovery_k8s_io_v1beta1_k8s1_20
typealias EndpointPort = EndpointPort_core_v1_k8s1_20
typealias EndpointSlice = EndpointSlice_discovery_k8s_io_v1beta1_k8s1_20
typealias EndpointSubset = EndpointSubset_core_v1_k8s1_20
typealias Endpoints = Endpoints_core_v1_k8s1_20
typealias EnvFromSource = EnvFromSource_core_v1_k8s1_20
typealias EnvVar = EnvVar_core_v1_k8s1_20
typealias EnvVarSource = EnvVarSource_core_v1_k8s1_20
typealias EphemeralContainer = EphemeralContainer_core_v1_k8s1_20
typealias EphemeralVolumeSource = EphemeralVolumeSource_core_v1_k8s1_20
typealias Event = Event_core_v1_k8s1_20
typealias EventSeries = EventSeries_core_v1_k8s1_20
typealias EventSource = EventSource_core_v1_k8s1_20
typealias Eviction = Eviction_policy_v1beta1_k8s1_20
typealias ExecAction = ExecAction_core_v1_k8s1_20
typealias ExternalDocumentation = ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_20
typealias ExternalMetricSource = ExternalMetricSource_autoscaling_v2beta2_k8s1_20
typealias ExternalMetricStatus = ExternalMetricStatus_autoscaling_v2beta2_k8s1_20
typealias FCVolumeSource = FCVolumeSource_core_v1_k8s1_20
typealias FSGroupStrategyOptions = FSGroupStrategyOptions_policy_v1beta1_k8s1_20
typealias FieldsV1 = FieldsV1_meta_v1_k8s1_20
typealias FlexPersistentVolumeSource = FlexPersistentVolumeSource_core_v1_k8s1_20
typealias FlexVolumeSource = FlexVolumeSource_core_v1_k8s1_20
typealias FlockerVolumeSource = FlockerVolumeSource_core_v1_k8s1_20
typealias FlowDistinguisherMethod = FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias FlowSchema = FlowSchema_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias FlowSchemaCondition = FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias Flowschemaspec = Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias Flowschemastatus = Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias GCEPersistentDiskVolumeSource = GCEPersistentDiskVolumeSource_core_v1_k8s1_20
typealias GitRepoVolumeSource = GitRepoVolumeSource_core_v1_k8s1_20
typealias GlusterfsPersistentVolumeSource = GlusterfsPersistentVolumeSource_core_v1_k8s1_20
typealias GlusterfsVolumeSource = GlusterfsVolumeSource_core_v1_k8s1_20
typealias GroupSubject = GroupSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias GroupVersionForDiscovery = GroupVersionForDiscovery_meta_v1_k8s1_20
typealias HPAScalingPolicy = HPAScalingPolicy_autoscaling_v2beta2_k8s1_20
typealias HPAScalingRules = HPAScalingRules_autoscaling_v2beta2_k8s1_20
typealias HTTPGetAction = HTTPGetAction_core_v1_k8s1_20
typealias HTTPHeader = HTTPHeader_core_v1_k8s1_20
typealias HTTPIngressPath = HTTPIngressPath_networking_k8s_io_v1_k8s1_20
typealias HTTPIngressRuleValue = HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_20
typealias Handler = Handler_core_v1_k8s1_20
typealias HorizontalPodAutoscaler = HorizontalPodAutoscaler_autoscaling_v1_k8s1_20
typealias HorizontalPodAutoscalerBehavior = HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_20
typealias HorizontalPodAutoscalerCondition = HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_20
typealias Horizontalpodautoscalerspec = Horizontalpodautoscalerspec_autoscaling_v1_k8s1_20
typealias Horizontalpodautoscalerstatus = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_20
typealias HostAlias = HostAlias_core_v1_k8s1_20
typealias HostPathVolumeSource = HostPathVolumeSource_core_v1_k8s1_20
typealias HostPortRange = HostPortRange_policy_v1beta1_k8s1_20
typealias IDRange = IDRange_policy_v1beta1_k8s1_20
typealias IPBlock = IPBlock_networking_k8s_io_v1_k8s1_20
typealias ISCSIPersistentVolumeSource = ISCSIPersistentVolumeSource_core_v1_k8s1_20
typealias ISCSIVolumeSource = ISCSIVolumeSource_core_v1_k8s1_20
typealias Ingress = Ingress_networking_k8s_io_v1_k8s1_20
typealias IngressBackend = IngressBackend_networking_k8s_io_v1_k8s1_20
typealias IngressClass = IngressClass_networking_k8s_io_v1_k8s1_20
typealias IngressRule = IngressRule_networking_k8s_io_v1_k8s1_20
typealias IngressServiceBackend = IngressServiceBackend_networking_k8s_io_v1_k8s1_20
typealias IngressTLS = IngressTLS_networking_k8s_io_v1_k8s1_20
typealias Ingressclassspec = Ingressclassspec_networking_k8s_io_v1_k8s1_20
typealias Ingressspec = Ingressspec_networking_k8s_io_v1_k8s1_20
typealias Ingressstatus = Ingressstatus_networking_k8s_io_v1_k8s1_20
typealias JSON = JSON_apiextensions_k8s_io_v1_k8s1_20
typealias JSONSchemaProps = JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_20
typealias JSONSchemaPropsOrArray = JSONSchemaPropsOrArray_apiextensions_k8s_io_v1_k8s1_20
typealias JSONSchemaPropsOrBool = JSONSchemaPropsOrBool_apiextensions_k8s_io_v1_k8s1_20
typealias Job = Job_batch_v1_k8s1_20
typealias JobCondition = JobCondition_batch_v1_k8s1_20
typealias JobTemplateSpec = JobTemplateSpec_batch_v1beta1_k8s1_20
typealias Jobspec = Jobspec_batch_v1_k8s1_20
typealias Jobstatus = Jobstatus_batch_v1_k8s1_20
typealias KeyToPath = KeyToPath_core_v1_k8s1_20
typealias LabelSelector = LabelSelector_meta_v1_k8s1_20
typealias LabelSelectorRequirement = LabelSelectorRequirement_meta_v1_k8s1_20
typealias Lease = Lease_coordination_k8s_io_v1_k8s1_20
typealias Leasespec = Leasespec_coordination_k8s_io_v1_k8s1_20
typealias Lifecycle = Lifecycle_core_v1_k8s1_20
typealias LimitRange = LimitRange_core_v1_k8s1_20
typealias LimitRangeItem = LimitRangeItem_core_v1_k8s1_20
typealias LimitResponse = LimitResponse_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias LimitedPriorityLevelConfiguration = LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias Limitrangespec = Limitrangespec_core_v1_k8s1_20
typealias ListMeta = ListMeta_meta_v1_k8s1_20
typealias LoadBalancerIngress = LoadBalancerIngress_core_v1_k8s1_20
typealias LoadBalancerStatus = LoadBalancerStatus_core_v1_k8s1_20
typealias LocalObjectReference = LocalObjectReference_core_v1_k8s1_20
typealias LocalSubjectAccessReview = LocalSubjectAccessReview_authorization_k8s_io_v1_k8s1_20
typealias LocalVolumeSource = LocalVolumeSource_core_v1_k8s1_20
typealias ManagedFieldsEntry = ManagedFieldsEntry_meta_v1_k8s1_20
typealias MetricIdentifier = MetricIdentifier_autoscaling_v2beta2_k8s1_20
typealias MetricSpec = MetricSpec_autoscaling_v2beta2_k8s1_20
typealias MetricStatus = MetricStatus_autoscaling_v2beta2_k8s1_20
typealias MetricTarget = MetricTarget_autoscaling_v2beta2_k8s1_20
typealias MetricValueStatus = MetricValueStatus_autoscaling_v2beta2_k8s1_20
typealias MicroTime = MicroTime_meta_v1_k8s1_20
typealias MutatingWebhook = MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_20
typealias MutatingWebhookConfiguration = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_20
typealias NFSVolumeSource = NFSVolumeSource_core_v1_k8s1_20
typealias Namespace = Namespace_core_v1_k8s1_20
typealias NamespaceCondition = NamespaceCondition_core_v1_k8s1_20
typealias Namespacespec = Namespacespec_core_v1_k8s1_20
typealias Namespacestatus = Namespacestatus_core_v1_k8s1_20
typealias NetworkPolicy = NetworkPolicy_networking_k8s_io_v1_k8s1_20
typealias NetworkPolicyEgressRule = NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_20
typealias NetworkPolicyIngressRule = NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_20
typealias NetworkPolicyPeer = NetworkPolicyPeer_networking_k8s_io_v1_k8s1_20
typealias NetworkPolicyPort = NetworkPolicyPort_networking_k8s_io_v1_k8s1_20
typealias Networkpolicyspec = Networkpolicyspec_networking_k8s_io_v1_k8s1_20
typealias Node = Node_core_v1_k8s1_20
typealias NodeAddress = NodeAddress_core_v1_k8s1_20
typealias NodeAffinity = NodeAffinity_core_v1_k8s1_20
typealias NodeCondition = NodeCondition_core_v1_k8s1_20
typealias NodeConfigSource = NodeConfigSource_core_v1_k8s1_20
typealias NodeConfigStatus = NodeConfigStatus_core_v1_k8s1_20
typealias NodeDaemonEndpoints = NodeDaemonEndpoints_core_v1_k8s1_20
typealias NodeSelector = NodeSelector_core_v1_k8s1_20
typealias NodeSelectorRequirement = NodeSelectorRequirement_core_v1_k8s1_20
typealias NodeSelectorTerm = NodeSelectorTerm_core_v1_k8s1_20
typealias NodeSystemInfo = NodeSystemInfo_core_v1_k8s1_20
typealias Nodespec = Nodespec_core_v1_k8s1_20
typealias Nodestatus = Nodestatus_core_v1_k8s1_20
typealias NonResourceAttributes = NonResourceAttributes_authorization_k8s_io_v1_k8s1_20
typealias NonResourcePolicyRule = NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias NonResourceRule = NonResourceRule_authorization_k8s_io_v1_k8s1_20
typealias ObjectFieldSelector = ObjectFieldSelector_core_v1_k8s1_20
typealias ObjectMeta = ObjectMeta_meta_v1_k8s1_20
typealias ObjectMetricSource = ObjectMetricSource_autoscaling_v2beta2_k8s1_20
typealias ObjectMetricStatus = ObjectMetricStatus_autoscaling_v2beta2_k8s1_20
typealias ObjectReference = ObjectReference_core_v1_k8s1_20
typealias Overhead = Overhead_node_k8s_io_v1_k8s1_20
typealias OwnerReference = OwnerReference_meta_v1_k8s1_20
typealias Patch = Patch_meta_v1_k8s1_20
typealias PersistentVolume = PersistentVolume_core_v1_k8s1_20
typealias PersistentVolumeClaim = PersistentVolumeClaim_core_v1_k8s1_20
typealias PersistentVolumeClaimCondition = PersistentVolumeClaimCondition_core_v1_k8s1_20
typealias PersistentVolumeClaimTemplate = PersistentVolumeClaimTemplate_core_v1_k8s1_20
typealias PersistentVolumeClaimVolumeSource = PersistentVolumeClaimVolumeSource_core_v1_k8s1_20
typealias Persistentvolumeclaimspec = Persistentvolumeclaimspec_core_v1_k8s1_20
typealias Persistentvolumeclaimstatus = Persistentvolumeclaimstatus_core_v1_k8s1_20
typealias Persistentvolumespec = Persistentvolumespec_core_v1_k8s1_20
typealias Persistentvolumestatus = Persistentvolumestatus_core_v1_k8s1_20
typealias PhotonPersistentDiskVolumeSource = PhotonPersistentDiskVolumeSource_core_v1_k8s1_20
typealias Pod = Pod_core_v1_k8s1_20
typealias PodAffinity = PodAffinity_core_v1_k8s1_20
typealias PodAffinityTerm = PodAffinityTerm_core_v1_k8s1_20
typealias PodAntiAffinity = PodAntiAffinity_core_v1_k8s1_20
typealias PodCondition = PodCondition_core_v1_k8s1_20
typealias PodDNSConfig = PodDNSConfig_core_v1_k8s1_20
typealias PodDNSConfigOption = PodDNSConfigOption_core_v1_k8s1_20
typealias PodDisruptionBudget = PodDisruptionBudget_policy_v1beta1_k8s1_20
typealias PodIP = PodIP_core_v1_k8s1_20
typealias PodReadinessGate = PodReadinessGate_core_v1_k8s1_20
typealias PodSecurityContext = PodSecurityContext_core_v1_k8s1_20
typealias PodSecurityPolicy = PodSecurityPolicy_policy_v1beta1_k8s1_20
typealias PodTemplate = PodTemplate_core_v1_k8s1_20
typealias Poddisruptionbudgetspec = Poddisruptionbudgetspec_policy_v1beta1_k8s1_20
typealias Poddisruptionbudgetstatus = Poddisruptionbudgetstatus_policy_v1beta1_k8s1_20
typealias PodsMetricSource = PodsMetricSource_autoscaling_v2beta2_k8s1_20
typealias PodsMetricStatus = PodsMetricStatus_autoscaling_v2beta2_k8s1_20
typealias Podsecuritypolicyspec = Podsecuritypolicyspec_policy_v1beta1_k8s1_20
typealias Podspec = Podspec_core_v1_k8s1_20
typealias Podstatus = Podstatus_core_v1_k8s1_20
typealias Podtemplatespec = Podtemplatespec_core_v1_k8s1_20
typealias PolicyRule = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_20
typealias PolicyRulesWithSubjects = PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias PortStatus = PortStatus_core_v1_k8s1_20
typealias PortworxVolumeSource = PortworxVolumeSource_core_v1_k8s1_20
typealias Preconditions = Preconditions_meta_v1_k8s1_20
typealias PreferredSchedulingTerm = PreferredSchedulingTerm_core_v1_k8s1_20
typealias PriorityClass = PriorityClass_scheduling_k8s_io_v1_k8s1_20
typealias PriorityLevelConfiguration = PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias PriorityLevelConfigurationCondition = PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias PriorityLevelConfigurationReference = PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias Prioritylevelconfigurationspec = Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias Prioritylevelconfigurationstatus = Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias Probe = Probe_core_v1_k8s1_20
typealias ProjectedVolumeSource = ProjectedVolumeSource_core_v1_k8s1_20
typealias Quantity = Quantity_core_resource_k8s1_20
typealias QueuingConfiguration = QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias QuobyteVolumeSource = QuobyteVolumeSource_core_v1_k8s1_20
typealias RBDPersistentVolumeSource = RBDPersistentVolumeSource_core_v1_k8s1_20
typealias RBDVolumeSource = RBDVolumeSource_core_v1_k8s1_20
typealias ReplicaSet = ReplicaSet_apps_v1_k8s1_20
typealias ReplicaSetCondition = ReplicaSetCondition_apps_v1_k8s1_20
typealias Replicasetspec = Replicasetspec_apps_v1_k8s1_20
typealias Replicasetstatus = Replicasetstatus_apps_v1_k8s1_20
typealias ReplicationController = ReplicationController_core_v1_k8s1_20
typealias ReplicationControllerCondition = ReplicationControllerCondition_core_v1_k8s1_20
typealias Replicationcontrollerspec = Replicationcontrollerspec_core_v1_k8s1_20
typealias Replicationcontrollerstatus = Replicationcontrollerstatus_core_v1_k8s1_20
typealias ResourceAttributes = ResourceAttributes_authorization_k8s_io_v1_k8s1_20
typealias ResourceFieldSelector = ResourceFieldSelector_core_v1_k8s1_20
typealias ResourceMetricSource = ResourceMetricSource_autoscaling_v2beta2_k8s1_20
typealias ResourceMetricStatus = ResourceMetricStatus_autoscaling_v2beta2_k8s1_20
typealias ResourcePolicyRule = ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias ResourceQuota = ResourceQuota_core_v1_k8s1_20
typealias ResourceRequirements = ResourceRequirements_core_v1_k8s1_20
typealias ResourceRule = ResourceRule_authorization_k8s_io_v1_k8s1_20
typealias Resourcequotaspec = Resourcequotaspec_core_v1_k8s1_20
typealias Resourcequotastatus = Resourcequotastatus_core_v1_k8s1_20
typealias Role = Role_rbac_authorization_k8s_io_v1_k8s1_20
typealias RoleBinding = RoleBinding_rbac_authorization_k8s_io_v1_k8s1_20
typealias RoleRef = RoleRef_rbac_authorization_k8s_io_v1_k8s1_20
typealias RollingUpdateStatefulSetStrategy = RollingUpdateStatefulSetStrategy_apps_v1_k8s1_20
typealias Rollingupdatedaemonset = Rollingupdatedaemonset_apps_v1_k8s1_20
typealias Rollingupdatedeployment = Rollingupdatedeployment_apps_v1_k8s1_20
typealias RuleWithOperations = RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_20
typealias RunAsGroupStrategyOptions = RunAsGroupStrategyOptions_policy_v1beta1_k8s1_20
typealias RunAsUserStrategyOptions = RunAsUserStrategyOptions_policy_v1beta1_k8s1_20
typealias RuntimeClass = RuntimeClass_node_k8s_io_v1_k8s1_20
typealias RuntimeClassStrategyOptions = RuntimeClassStrategyOptions_policy_v1beta1_k8s1_20
typealias SELinuxOptions = SELinuxOptions_core_v1_k8s1_20
typealias SELinuxStrategyOptions = SELinuxStrategyOptions_policy_v1beta1_k8s1_20
typealias ScaleIOPersistentVolumeSource = ScaleIOPersistentVolumeSource_core_v1_k8s1_20
typealias ScaleIOVolumeSource = ScaleIOVolumeSource_core_v1_k8s1_20
typealias Scheduling = Scheduling_node_k8s_io_v1_k8s1_20
typealias ScopeSelector = ScopeSelector_core_v1_k8s1_20
typealias ScopedResourceSelectorRequirement = ScopedResourceSelectorRequirement_core_v1_k8s1_20
typealias SeccompProfile = SeccompProfile_core_v1_k8s1_20
typealias Secret = Secret_core_v1_k8s1_20
typealias SecretEnvSource = SecretEnvSource_core_v1_k8s1_20
typealias SecretKeySelector = SecretKeySelector_core_v1_k8s1_20
typealias SecretProjection = SecretProjection_core_v1_k8s1_20
typealias SecretReference = SecretReference_core_v1_k8s1_20
typealias SecretVolumeSource = SecretVolumeSource_core_v1_k8s1_20
typealias SecurityContext = SecurityContext_core_v1_k8s1_20
typealias SelfSubjectAccessReview = SelfSubjectAccessReview_authorization_k8s_io_v1_k8s1_20
typealias SelfSubjectRulesReview = SelfSubjectRulesReview_authorization_k8s_io_v1_k8s1_20
typealias Selfsubjectaccessreviewspec = Selfsubjectaccessreviewspec_authorization_k8s_io_v1_k8s1_20
typealias Selfsubjectrulesreviewspec = Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_20
typealias ServerAddressByClientCIDR = ServerAddressByClientCIDR_meta_v1_k8s1_20
typealias ServerStorageVersion = ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_20
typealias Service = Service_core_v1_k8s1_20
typealias ServiceAccount = ServiceAccount_core_v1_k8s1_20
typealias ServiceAccountSubject = ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias ServiceAccountTokenProjection = ServiceAccountTokenProjection_core_v1_k8s1_20
typealias ServiceBackendPort = ServiceBackendPort_networking_k8s_io_v1_k8s1_20
typealias ServicePort = ServicePort_core_v1_k8s1_20
typealias ServiceReference = ServiceReference_admissionregistration_k8s_io_v1_k8s1_20
typealias Servicespec = Servicespec_core_v1_k8s1_20
typealias Servicestatus = Servicestatus_core_v1_k8s1_20
typealias SessionAffinityConfig = SessionAffinityConfig_core_v1_k8s1_20
typealias StatefulSet = StatefulSet_apps_v1_k8s1_20
typealias StatefulSetCondition = StatefulSetCondition_apps_v1_k8s1_20
typealias StatefulSetUpdateStrategy = StatefulSetUpdateStrategy_apps_v1_k8s1_20
typealias Statefulsetspec = Statefulsetspec_apps_v1_k8s1_20
typealias Statefulsetstatus = Statefulsetstatus_apps_v1_k8s1_20
typealias Status = Status_meta_v1_k8s1_20
typealias StatusCause = StatusCause_meta_v1_k8s1_20
typealias StatusDetails = StatusDetails_meta_v1_k8s1_20
typealias StorageClass = StorageClass_storage_k8s_io_v1_k8s1_20
typealias StorageOSPersistentVolumeSource = StorageOSPersistentVolumeSource_core_v1_k8s1_20
typealias StorageOSVolumeSource = StorageOSVolumeSource_core_v1_k8s1_20
typealias StorageVersion = StorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_20
typealias StorageVersionCondition = StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1_k8s1_20
typealias Storageversionspec = Storageversionspec_internal_apiserver_k8s_io_v1alpha1_k8s1_20
typealias Storageversionstatus = Storageversionstatus_internal_apiserver_k8s_io_v1alpha1_k8s1_20
typealias Subject = Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias SubjectAccessReview = SubjectAccessReview_authorization_k8s_io_v1_k8s1_20
typealias SubjectRulesReviewStatus = SubjectRulesReviewStatus_authorization_k8s_io_v1_k8s1_20
typealias Subjectaccessreviewspec = Subjectaccessreviewspec_authorization_k8s_io_v1_k8s1_20
typealias Subjectaccessreviewstatus = Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_20
typealias SupplementalGroupsStrategyOptions = SupplementalGroupsStrategyOptions_policy_v1beta1_k8s1_20
typealias Sysctl = Sysctl_core_v1_k8s1_20
typealias TCPSocketAction = TCPSocketAction_core_v1_k8s1_20
typealias Taint = Taint_core_v1_k8s1_20
typealias Time = Time_meta_v1_k8s1_20
typealias TokenRequest = TokenRequest_authentication_k8s_io_v1_k8s1_20
typealias TokenReview = TokenReview_authentication_k8s_io_v1_k8s1_20
typealias Tokenrequestspec = Tokenrequestspec_authentication_k8s_io_v1_k8s1_20
typealias Tokenrequeststatus = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_20
typealias Tokenreviewspec = Tokenreviewspec_authentication_k8s_io_v1_k8s1_20
typealias Tokenreviewstatus = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_20
typealias Toleration = Toleration_core_v1_k8s1_20
typealias TopologySelectorLabelRequirement = TopologySelectorLabelRequirement_core_v1_k8s1_20
typealias TopologySelectorTerm = TopologySelectorTerm_core_v1_k8s1_20
typealias TopologySpreadConstraint = TopologySpreadConstraint_core_v1_k8s1_20
typealias TypedLocalObjectReference = TypedLocalObjectReference_core_v1_k8s1_20
typealias UserInfo = UserInfo_authentication_k8s_io_v1_k8s1_20
typealias UserSubject = UserSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
typealias ValidatingWebhook = ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_20
typealias ValidatingWebhookConfiguration = ValidatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_20
typealias Volume = Volume_core_v1_k8s1_20
typealias VolumeAttachment = VolumeAttachment_storage_k8s_io_v1_k8s1_20
typealias VolumeAttachmentSource = VolumeAttachmentSource_storage_k8s_io_v1_k8s1_20
typealias VolumeDevice = VolumeDevice_core_v1_k8s1_20
typealias VolumeError = VolumeError_storage_k8s_io_v1_k8s1_20
typealias VolumeMount = VolumeMount_core_v1_k8s1_20
typealias VolumeNodeAffinity = VolumeNodeAffinity_core_v1_k8s1_20
typealias VolumeNodeResources = VolumeNodeResources_storage_k8s_io_v1_k8s1_20
typealias VolumeProjection = VolumeProjection_core_v1_k8s1_20
typealias Volumeattachmentspec = Volumeattachmentspec_storage_k8s_io_v1_k8s1_20
typealias Volumeattachmentstatus = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_20
typealias VsphereVirtualDiskVolumeSource = VsphereVirtualDiskVolumeSource_core_v1_k8s1_20
typealias WatchEvent = WatchEvent_meta_v1_k8s1_20
typealias WebhookClientConfig = WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_20
typealias WebhookConversion = WebhookConversion_apiextensions_k8s_io_v1_k8s1_20
typealias WeightedPodAffinityTerm = WeightedPodAffinityTerm_core_v1_k8s1_20
typealias WindowsSecurityContextOptions = WindowsSecurityContextOptions_core_v1_k8s1_20