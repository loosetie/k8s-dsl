package de.loosetie.k8s.dsl

import de.loosetie.k8s.dsl.K8sApi
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.impls.*


@K8sDslMarker
fun K8sApi.crossversionobjectreference(init: CrossVersionObjectReference.() -> Unit): CrossVersionObjectReference =
  CrossVersionObjectReference_autoscaling_v2Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.horizontalpodautoscaler(init: HorizontalPodAutoscaler.() -> Unit): HorizontalPodAutoscaler =
  HorizontalPodAutoscaler_autoscaling_v2Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.flowschema(init: FlowSchema.() -> Unit): FlowSchema =
  FlowSchema_flowcontrol_apiserver_k8s_io_v1beta3Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.prioritylevelconfiguration(init: PriorityLevelConfiguration.() -> Unit): PriorityLevelConfiguration =
  PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta3Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.selfsubjectreview(init: SelfSubjectReview.() -> Unit): SelfSubjectReview =
  SelfSubjectReview_authentication_k8s_io_v1beta1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.podschedulingcontext(init: PodSchedulingContext.() -> Unit): PodSchedulingContext =
  PodSchedulingContext_resource_k8s_io_v1alpha2Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.resourceclaimtemplate(init: ResourceClaimTemplate.() -> Unit): ResourceClaimTemplate =
  ResourceClaimTemplate_resource_k8s_io_v1alpha2Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.resourceclaim(init: ResourceClaim.() -> Unit): ResourceClaim =
  ResourceClaim_resource_k8s_io_v1alpha2Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.resourceclass(init: ResourceClass.() -> Unit): ResourceClass =
  ResourceClass_resource_k8s_io_v1alpha2Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.clustercidr(init: ClusterCIDR.() -> Unit): ClusterCIDR =
  ClusterCIDR_networking_k8s_io_v1alpha1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.clustertrustbundle(init: ClusterTrustBundle.() -> Unit): ClusterTrustBundle =
  ClusterTrustBundle_certificates_k8s_io_v1alpha1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.ipaddress(init: IPAddress.() -> Unit): IPAddress =
  IPAddress_networking_k8s_io_v1alpha1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.paramkind(init: ParamKind.() -> Unit): ParamKind =
  ParamKind_admissionregistration_k8s_io_v1alpha1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.storageversion(init: StorageVersion.() -> Unit): StorageVersion =
  StorageVersion_internal_apiserver_k8s_io_v1alpha1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.validatingadmissionpolicybinding(init: ValidatingAdmissionPolicyBinding.() -> Unit): ValidatingAdmissionPolicyBinding =
  ValidatingAdmissionPolicyBinding_admissionregistration_k8s_io_v1alpha1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.validatingadmissionpolicy(init: ValidatingAdmissionPolicy.() -> Unit): ValidatingAdmissionPolicy =
  ValidatingAdmissionPolicy_admissionregistration_k8s_io_v1alpha1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.apigroup(init: APIGroup.() -> Unit): APIGroup =
  APIGroup_meta_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.apiservice(init: APIService.() -> Unit): APIService =
  APIService_apiregistration_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.apiversions(init: APIVersions.() -> Unit): APIVersions =
  APIVersions_meta_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.binding(init: Binding.() -> Unit): Binding =
  Binding_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.boundobjectreference(init: BoundObjectReference.() -> Unit): BoundObjectReference =
  BoundObjectReference_authentication_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.csidriver(init: CSIDriver.() -> Unit): CSIDriver =
  CSIDriver_storage_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.csinode(init: CSINode.() -> Unit): CSINode =
  CSINode_storage_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.csistoragecapacity(init: CSIStorageCapacity.() -> Unit): CSIStorageCapacity =
  CSIStorageCapacity_storage_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.certificatesigningrequest(init: CertificateSigningRequest.() -> Unit): CertificateSigningRequest =
  CertificateSigningRequest_certificates_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.clusterrolebinding(init: ClusterRoleBinding.() -> Unit): ClusterRoleBinding =
  ClusterRoleBinding_rbac_authorization_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.clusterrole(init: ClusterRole.() -> Unit): ClusterRole =
  ClusterRole_rbac_authorization_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.componentstatus(init: ComponentStatus.() -> Unit): ComponentStatus =
  ComponentStatus_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.configmap(init: ConfigMap.() -> Unit): ConfigMap =
  ConfigMap_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.controllerrevision(init: ControllerRevision.() -> Unit): ControllerRevision =
  ControllerRevision_apps_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.cronjob(init: CronJob.() -> Unit): CronJob =
  CronJob_batch_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.customresourcedefinition(init: CustomResourceDefinition.() -> Unit): CustomResourceDefinition =
  CustomResourceDefinition_apiextensions_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.daemonset(init: DaemonSet.() -> Unit): DaemonSet =
  DaemonSet_apps_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.deleteoptions(init: DeleteOptions.() -> Unit): DeleteOptions =
  DeleteOptions_meta_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.deployment(init: Deployment.() -> Unit): Deployment =
  Deployment_apps_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.endpointslice(init: EndpointSlice.() -> Unit): EndpointSlice =
  EndpointSlice_discovery_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.endpoints(init: Endpoints.() -> Unit): Endpoints =
  Endpoints_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.event(init: Event.() -> Unit): Event =
  Event_events_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.eviction(init: Eviction.() -> Unit): Eviction =
  Eviction_policy_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.ingressclass(init: IngressClass.() -> Unit): IngressClass =
  IngressClass_networking_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.ingress(init: Ingress.() -> Unit): Ingress =
  Ingress_networking_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.job(init: Job.() -> Unit): Job =
  Job_batch_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.lease(init: Lease.() -> Unit): Lease =
  Lease_coordination_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.limitrange(init: LimitRange.() -> Unit): LimitRange =
  LimitRange_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.localsubjectaccessreview(init: LocalSubjectAccessReview.() -> Unit): LocalSubjectAccessReview =
  LocalSubjectAccessReview_authorization_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.mutatingwebhookconfiguration(init: MutatingWebhookConfiguration.() -> Unit): MutatingWebhookConfiguration =
  MutatingWebhookConfiguration_admissionregistration_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.namespace(init: Namespace.() -> Unit): Namespace =
  Namespace_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.networkpolicy(init: NetworkPolicy.() -> Unit): NetworkPolicy =
  NetworkPolicy_networking_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.node(init: Node.() -> Unit): Node =
  Node_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.objectreference(init: ObjectReference.() -> Unit): ObjectReference =
  ObjectReference_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.ownerreference(init: OwnerReference.() -> Unit): OwnerReference =
  OwnerReference_meta_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.persistentvolumeclaim(init: PersistentVolumeClaim.() -> Unit): PersistentVolumeClaim =
  PersistentVolumeClaim_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.persistentvolume(init: PersistentVolume.() -> Unit): PersistentVolume =
  PersistentVolume_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.poddisruptionbudget(init: PodDisruptionBudget.() -> Unit): PodDisruptionBudget =
  PodDisruptionBudget_policy_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.podtemplate(init: PodTemplate.() -> Unit): PodTemplate =
  PodTemplate_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.pod(init: Pod.() -> Unit): Pod =
  Pod_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.priorityclass(init: PriorityClass.() -> Unit): PriorityClass =
  PriorityClass_scheduling_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.replicaset(init: ReplicaSet.() -> Unit): ReplicaSet =
  ReplicaSet_apps_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.replicationcontroller(init: ReplicationController.() -> Unit): ReplicationController =
  ReplicationController_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.resourcequota(init: ResourceQuota.() -> Unit): ResourceQuota =
  ResourceQuota_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.rolebinding(init: RoleBinding.() -> Unit): RoleBinding =
  RoleBinding_rbac_authorization_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.role(init: Role.() -> Unit): Role =
  Role_rbac_authorization_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.runtimeclass(init: RuntimeClass.() -> Unit): RuntimeClass =
  RuntimeClass_node_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.scale(init: Scale.() -> Unit): Scale =
  Scale_autoscaling_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.secret(init: Secret.() -> Unit): Secret =
  Secret_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.selfsubjectaccessreview(init: SelfSubjectAccessReview.() -> Unit): SelfSubjectAccessReview =
  SelfSubjectAccessReview_authorization_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.selfsubjectrulesreview(init: SelfSubjectRulesReview.() -> Unit): SelfSubjectRulesReview =
  SelfSubjectRulesReview_authorization_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.serviceaccount(init: ServiceAccount.() -> Unit): ServiceAccount =
  ServiceAccount_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.service(init: Service.() -> Unit): Service =
  Service_core_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.statefulset(init: StatefulSet.() -> Unit): StatefulSet =
  StatefulSet_apps_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.status(init: Status.() -> Unit): Status =
  Status_meta_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.storageclass(init: StorageClass.() -> Unit): StorageClass =
  StorageClass_storage_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.subjectaccessreview(init: SubjectAccessReview.() -> Unit): SubjectAccessReview =
  SubjectAccessReview_authorization_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.tokenrequest(init: TokenRequest.() -> Unit): TokenRequest =
  TokenRequest_authentication_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.tokenreview(init: TokenReview.() -> Unit): TokenReview =
  TokenReview_authentication_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.validatingwebhookconfiguration(init: ValidatingWebhookConfiguration.() -> Unit): ValidatingWebhookConfiguration =
  ValidatingWebhookConfiguration_admissionregistration_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.volumeattachment(init: VolumeAttachment.() -> Unit): VolumeAttachment =
  VolumeAttachment_storage_k8s_io_v1Impl()
    .also{manifests.add(it)}
    .apply(init)