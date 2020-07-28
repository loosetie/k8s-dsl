package de.loosetie.k8s.dsl

import de.loosetie.k8s.dsl.K8sApi
import de.loosetie.k8s.dsl.K8sDslMarker

@K8sDslMarker
fun K8sApi.cronjob(init: CronJob.() -> Unit): CronJob =
  CronJob_v1beta1_batchImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.daemonset(init: DaemonSet.() -> Unit): DaemonSet =
  DaemonSet_v1_appsImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.deployment(init: Deployment.() -> Unit): Deployment =
  Deployment_v1_appsImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.job(init: Job.() -> Unit): Job =
  Job_v1_batchImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.pod(init: Pod.() -> Unit): Pod =
  Pod_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.replicaset(init: ReplicaSet.() -> Unit): ReplicaSet =
  ReplicaSet_v1_appsImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.replicationcontroller(init: ReplicationController.() -> Unit): ReplicationController =
  ReplicationController_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.statefulset(init: StatefulSet.() -> Unit): StatefulSet =
  StatefulSet_v1_appsImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.endpoints(init: Endpoints.() -> Unit): Endpoints =
  Endpoints_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.endpointslice(init: EndpointSlice.() -> Unit): EndpointSlice =
  EndpointSlice_v1beta1_discovery_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.ingress(init: Ingress.() -> Unit): Ingress =
  Ingress_v1beta1_networking_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.service(init: Service.() -> Unit): Service =
  Service_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.configmap(init: ConfigMap.() -> Unit): ConfigMap =
  ConfigMap_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.csidriver(init: CSIDriver.() -> Unit): CSIDriver =
  CSIDriver_v1beta1_storage_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.csinode(init: CSINode.() -> Unit): CSINode =
  CSINode_v1_storage_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.secret(init: Secret.() -> Unit): Secret =
  Secret_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.persistentvolumeclaim(init: PersistentVolumeClaim.() -> Unit): PersistentVolumeClaim =
  PersistentVolumeClaim_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.storageclass(init: StorageClass.() -> Unit): StorageClass =
  StorageClass_v1_storage_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.volumeattachment(init: VolumeAttachment.() -> Unit): VolumeAttachment =
  VolumeAttachment_v1_storage_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.controllerrevision(init: ControllerRevision.() -> Unit): ControllerRevision =
  ControllerRevision_v1_appsImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.customresourcedefinition(init: CustomResourceDefinition.() -> Unit): CustomResourceDefinition =
  CustomResourceDefinition_v1_apiextensions_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.event(init: Event.() -> Unit): Event =
  Event_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.limitrange(init: LimitRange.() -> Unit): LimitRange =
  LimitRange_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.horizontalpodautoscaler(init: HorizontalPodAutoscaler.() -> Unit): HorizontalPodAutoscaler =
  HorizontalPodAutoscaler_v1_autoscalingImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.mutatingwebhookconfiguration(init: MutatingWebhookConfiguration.() -> Unit): MutatingWebhookConfiguration =
  MutatingWebhookConfiguration_v1_admissionregistration_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.validatingwebhookconfiguration(init: ValidatingWebhookConfiguration.() -> Unit): ValidatingWebhookConfiguration =
  ValidatingWebhookConfiguration_v1_admissionregistration_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.podtemplate(init: PodTemplate.() -> Unit): PodTemplate =
  PodTemplate_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.poddisruptionbudget(init: PodDisruptionBudget.() -> Unit): PodDisruptionBudget =
  PodDisruptionBudget_v1beta1_policyImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.priorityclass(init: PriorityClass.() -> Unit): PriorityClass =
  PriorityClass_v1_scheduling_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.podpreset(init: PodPreset.() -> Unit): PodPreset =
  PodPreset_v1alpha1_settings_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.podsecuritypolicy(init: PodSecurityPolicy.() -> Unit): PodSecurityPolicy =
  PodSecurityPolicy_v1beta1_policyImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.apiservice(init: APIService.() -> Unit): APIService =
  APIService_v1_apiregistration_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.auditsink(init: AuditSink.() -> Unit): AuditSink =
  AuditSink_v1alpha1_auditregistration_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.binding(init: Binding.() -> Unit): Binding =
  Binding_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.certificatesigningrequest(init: CertificateSigningRequest.() -> Unit): CertificateSigningRequest =
  CertificateSigningRequest_v1beta1_certificates_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.clusterrole(init: ClusterRole.() -> Unit): ClusterRole =
  ClusterRole_v1_rbac_authorization_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.clusterrolebinding(init: ClusterRoleBinding.() -> Unit): ClusterRoleBinding =
  ClusterRoleBinding_v1_rbac_authorization_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.componentstatus(init: ComponentStatus.() -> Unit): ComponentStatus =
  ComponentStatus_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.flowschema(init: FlowSchema.() -> Unit): FlowSchema =
  FlowSchema_v1alpha1_flowcontrol_apiserver_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.lease(init: Lease.() -> Unit): Lease =
  Lease_v1_coordination_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.localsubjectaccessreview(init: LocalSubjectAccessReview.() -> Unit): LocalSubjectAccessReview =
  LocalSubjectAccessReview_v1_authorization_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.namespace(init: Namespace.() -> Unit): Namespace =
  Namespace_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.node(init: Node.() -> Unit): Node =
  Node_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.persistentvolume(init: PersistentVolume.() -> Unit): PersistentVolume =
  PersistentVolume_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.prioritylevelconfiguration(init: PriorityLevelConfiguration.() -> Unit): PriorityLevelConfiguration =
  PriorityLevelConfiguration_v1alpha1_flowcontrol_apiserver_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.resourcequota(init: ResourceQuota.() -> Unit): ResourceQuota =
  ResourceQuota_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.role(init: Role.() -> Unit): Role =
  Role_v1_rbac_authorization_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.rolebinding(init: RoleBinding.() -> Unit): RoleBinding =
  RoleBinding_v1_rbac_authorization_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.runtimeclass(init: RuntimeClass.() -> Unit): RuntimeClass =
  RuntimeClass_v1beta1_node_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.selfsubjectaccessreview(init: SelfSubjectAccessReview.() -> Unit): SelfSubjectAccessReview =
  SelfSubjectAccessReview_v1_authorization_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.selfsubjectrulesreview(init: SelfSubjectRulesReview.() -> Unit): SelfSubjectRulesReview =
  SelfSubjectRulesReview_v1_authorization_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.serviceaccount(init: ServiceAccount.() -> Unit): ServiceAccount =
  ServiceAccount_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.subjectaccessreview(init: SubjectAccessReview.() -> Unit): SubjectAccessReview =
  SubjectAccessReview_v1_authorization_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.tokenrequest(init: TokenRequest.() -> Unit): TokenRequest =
  TokenRequest_v1_authentication_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.tokenreview(init: TokenReview.() -> Unit): TokenReview =
  TokenReview_v1_authentication_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.networkpolicy(init: NetworkPolicy.() -> Unit): NetworkPolicy =
  NetworkPolicy_v1_networking_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.apigroup(init: APIGroup.() -> Unit): APIGroup =
  APIGroup_v1_metaImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.apiversions(init: APIVersions.() -> Unit): APIVersions =
  APIVersions_v1_metaImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.boundobjectreference(init: BoundObjectReference.() -> Unit): BoundObjectReference =
  BoundObjectReference_v1_authentication_k8s_ioImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.crossversionobjectreference(init: CrossVersionObjectReference.() -> Unit): CrossVersionObjectReference =
  CrossVersionObjectReference_v1_autoscalingImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.deleteoptions(init: DeleteOptions.() -> Unit): DeleteOptions =
  DeleteOptions_v1_metaImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.eviction(init: Eviction.() -> Unit): Eviction =
  Eviction_v1beta1_policyImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.objectreference(init: ObjectReference.() -> Unit): ObjectReference =
  ObjectReference_v1_coreImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.ownerreference(init: OwnerReference.() -> Unit): OwnerReference =
  OwnerReference_v1_metaImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.scale(init: Scale.() -> Unit): Scale =
  Scale_v1beta2_appsImpl()
    .also{manifests.add(it)}
    .apply(init)

@K8sDslMarker
fun K8sApi.status(init: Status.() -> Unit): Status =
  Status_v1_metaImpl()
    .also{manifests.add(it)}
    .apply(init)