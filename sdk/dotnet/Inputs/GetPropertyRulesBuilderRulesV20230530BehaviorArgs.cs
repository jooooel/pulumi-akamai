// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("adScalerCircuitBreaker")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAdScalerCircuitBreakerInputArgs>? AdScalerCircuitBreaker { get; set; }

        [Input("adaptiveAcceleration")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationInputArgs>? AdaptiveAcceleration { get; set; }

        [Input("adaptiveImageCompression")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveImageCompressionInputArgs>? AdaptiveImageCompression { get; set; }

        [Input("advanced")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAdvancedInputArgs>? Advanced { get; set; }

        [Input("aggregatedReporting")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAggregatedReportingInputArgs>? AggregatedReporting { get; set; }

        [Input("akamaizer")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAkamaizerInputArgs>? Akamaizer { get; set; }

        [Input("akamaizerTag")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAkamaizerTagInputArgs>? AkamaizerTag { get; set; }

        [Input("allHttpInCacheHierarchy")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllHttpInCacheHierarchyInputArgs>? AllHttpInCacheHierarchy { get; set; }

        [Input("allowCloudletsOrigins")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowCloudletsOriginsInputArgs>? AllowCloudletsOrigins { get; set; }

        [Input("allowDelete")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowDeleteInputArgs>? AllowDelete { get; set; }

        [Input("allowHttpsCacheKeySharing")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowHttpsCacheKeySharingInputArgs>? AllowHttpsCacheKeySharing { get; set; }

        [Input("allowHttpsDowngrade")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowHttpsDowngradeInputArgs>? AllowHttpsDowngrade { get; set; }

        [Input("allowOptions")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowOptionsInputArgs>? AllowOptions { get; set; }

        [Input("allowPatch")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowPatchInputArgs>? AllowPatch { get; set; }

        [Input("allowPost")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostInputArgs>? AllowPost { get; set; }

        [Input("allowPut")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowPutInputArgs>? AllowPut { get; set; }

        [Input("allowTransferEncoding")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAllowTransferEncodingInputArgs>? AllowTransferEncoding { get; set; }

        [Input("altSvcHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAltSvcHeaderInputArgs>? AltSvcHeader { get; set; }

        [Input("apiPrioritization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationInputArgs>? ApiPrioritization { get; set; }

        [Input("applicationLoadBalancer")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerInputArgs>? ApplicationLoadBalancer { get; set; }

        [Input("audienceSegmentation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentationInputArgs>? AudienceSegmentation { get; set; }

        [Input("autoDomainValidation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorAutoDomainValidationInputArgs>? AutoDomainValidation { get; set; }

        [Input("baseDirectory")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorBaseDirectoryInputArgs>? BaseDirectory { get; set; }

        [Input("bossBeaconing")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconingInputArgs>? BossBeaconing { get; set; }

        [Input("breadcrumbs")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorBreadcrumbsInputArgs>? Breadcrumbs { get; set; }

        [Input("breakConnection")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorBreakConnectionInputArgs>? BreakConnection { get; set; }

        [Input("brotli")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorBrotliInputArgs>? Brotli { get; set; }

        [Input("cacheError")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCacheErrorInputArgs>? CacheError { get; set; }

        [Input("cacheId")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCacheIdInputArgs>? CacheId { get; set; }

        [Input("cacheKeyIgnoreCase")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyIgnoreCaseInputArgs>? CacheKeyIgnoreCase { get; set; }

        [Input("cacheKeyQueryParams")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsInputArgs>? CacheKeyQueryParams { get; set; }

        [Input("cacheKeyRewrite")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyRewriteInputArgs>? CacheKeyRewrite { get; set; }

        [Input("cachePost")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCachePostInputArgs>? CachePost { get; set; }

        [Input("cacheRedirect")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCacheRedirectInputArgs>? CacheRedirect { get; set; }

        [Input("cacheTag")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCacheTagInputArgs>? CacheTag { get; set; }

        [Input("cacheTagVisible")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCacheTagVisibleInputArgs>? CacheTagVisible { get; set; }

        [Input("caching")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCachingInputArgs>? Caching { get; set; }

        [Input("centralAuthorization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCentralAuthorizationInputArgs>? CentralAuthorization { get; set; }

        [Input("chaseRedirects")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorChaseRedirectsInputArgs>? ChaseRedirects { get; set; }

        [Input("clientCharacteristics")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorClientCharacteristicsInputArgs>? ClientCharacteristics { get; set; }

        [Input("cloudInterconnects")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCloudInterconnectsInputArgs>? CloudInterconnects { get; set; }

        [Input("cloudWrapper")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCloudWrapperInputArgs>? CloudWrapper { get; set; }

        [Input("cloudWrapperAdvanced")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCloudWrapperAdvancedInputArgs>? CloudWrapperAdvanced { get; set; }

        [Input("commonMediaClientData")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCommonMediaClientDataInputArgs>? CommonMediaClientData { get; set; }

        [Input("conditionalOrigin")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorConditionalOriginInputArgs>? ConditionalOrigin { get; set; }

        [Input("constructResponse")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponseInputArgs>? ConstructResponse { get; set; }

        [Input("contentCharacteristics")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsInputArgs>? ContentCharacteristics { get; set; }

        [Input("contentCharacteristicsAmd")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsAmdInputArgs>? ContentCharacteristicsAmd { get; set; }

        [Input("contentCharacteristicsDd")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsDdInputArgs>? ContentCharacteristicsDd { get; set; }

        [Input("contentCharacteristicsWsdLargeFile")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdLargeFileInputArgs>? ContentCharacteristicsWsdLargeFile { get; set; }

        [Input("contentCharacteristicsWsdLive")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdLiveInputArgs>? ContentCharacteristicsWsdLive { get; set; }

        [Input("contentCharacteristicsWsdVod")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdVodInputArgs>? ContentCharacteristicsWsdVod { get; set; }

        [Input("contentPrePosition")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionInputArgs>? ContentPrePosition { get; set; }

        [Input("contentTargetingProtection")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtectionInputArgs>? ContentTargetingProtection { get; set; }

        [Input("corsSupport")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportInputArgs>? CorsSupport { get; set; }

        [Input("cpCode")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCpCodeInputArgs>? CpCode { get; set; }

        [Input("customBehavior")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorCustomBehaviorInputArgs>? CustomBehavior { get; set; }

        [Input("datastream")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDatastreamInputArgs>? Datastream { get; set; }

        [Input("dcp")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDcpInputArgs>? Dcp { get; set; }

        [Input("dcpAuthHmacTransformation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationInputArgs>? DcpAuthHmacTransformation { get; set; }

        [Input("dcpAuthRegexTransformation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthRegexTransformationInputArgs>? DcpAuthRegexTransformation { get; set; }

        [Input("dcpAuthSubstringTransformation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthSubstringTransformationInputArgs>? DcpAuthSubstringTransformation { get; set; }

        [Input("dcpAuthVariableExtractor")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractorInputArgs>? DcpAuthVariableExtractor { get; set; }

        [Input("dcpDefaultAuthzGroups")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDcpDefaultAuthzGroupsInputArgs>? DcpDefaultAuthzGroups { get; set; }

        [Input("dcpDevRelations")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDcpDevRelationsInputArgs>? DcpDevRelations { get; set; }

        [Input("dcpRealTimeAuth")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDcpRealTimeAuthInputArgs>? DcpRealTimeAuth { get; set; }

        [Input("deliveryReceipt")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDeliveryReceiptInputArgs>? DeliveryReceipt { get; set; }

        [Input("denyAccess")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDenyAccessInputArgs>? DenyAccess { get; set; }

        [Input("denyDirectFailoverAccess")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDenyDirectFailoverAccessInputArgs>? DenyDirectFailoverAccess { get; set; }

        [Input("deviceCharacteristicCacheId")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDeviceCharacteristicCacheIdInputArgs>? DeviceCharacteristicCacheId { get; set; }

        [Input("deviceCharacteristicHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDeviceCharacteristicHeaderInputArgs>? DeviceCharacteristicHeader { get; set; }

        [Input("dnsAsyncRefresh")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDnsAsyncRefreshInputArgs>? DnsAsyncRefresh { get; set; }

        [Input("dnsPrefresh")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDnsPrefreshInputArgs>? DnsPrefresh { get; set; }

        [Input("downgradeProtocol")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDowngradeProtocolInputArgs>? DowngradeProtocol { get; set; }

        [Input("downloadCompleteMarker")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDownloadCompleteMarkerInputArgs>? DownloadCompleteMarker { get; set; }

        [Input("downloadNotification")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDownloadNotificationInputArgs>? DownloadNotification { get; set; }

        [Input("downstreamCache")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDownstreamCacheInputArgs>? DownstreamCache { get; set; }

        [Input("dynamicThroughtputOptimization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDynamicThroughtputOptimizationInputArgs>? DynamicThroughtputOptimization { get; set; }

        [Input("dynamicThroughtputOptimizationOverride")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDynamicThroughtputOptimizationOverrideInputArgs>? DynamicThroughtputOptimizationOverride { get; set; }

        [Input("dynamicWebContent")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorDynamicWebContentInputArgs>? DynamicWebContent { get; set; }

        [Input("ecmsBulkUpload")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEcmsBulkUploadInputArgs>? EcmsBulkUpload { get; set; }

        [Input("ecmsDatabase")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabaseInputArgs>? EcmsDatabase { get; set; }

        [Input("ecmsDataset")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatasetInputArgs>? EcmsDataset { get; set; }

        [Input("ecmsObjectKey")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEcmsObjectKeyInputArgs>? EcmsObjectKey { get; set; }

        [Input("edgeConnect")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeConnectInputArgs>? EdgeConnect { get; set; }

        [Input("edgeLoadBalancingAdvanced")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingAdvancedInputArgs>? EdgeLoadBalancingAdvanced { get; set; }

        [Input("edgeLoadBalancingDataCenter")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingDataCenterInputArgs>? EdgeLoadBalancingDataCenter { get; set; }

        [Input("edgeLoadBalancingOrigin")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingOriginInputArgs>? EdgeLoadBalancingOrigin { get; set; }

        [Input("edgeOriginAuthorization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeOriginAuthorizationInputArgs>? EdgeOriginAuthorization { get; set; }

        [Input("edgeRedirector")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorInputArgs>? EdgeRedirector { get; set; }

        [Input("edgeScape")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeScapeInputArgs>? EdgeScape { get; set; }

        [Input("edgeSideIncludes")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeSideIncludesInputArgs>? EdgeSideIncludes { get; set; }

        [Input("edgeWorker")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeWorkerInputArgs>? EdgeWorker { get; set; }

        [Input("enhancedAkamaiProtocol")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEnhancedAkamaiProtocolInputArgs>? EnhancedAkamaiProtocol { get; set; }

        [Input("enhancedProxyDetection")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEnhancedProxyDetectionInputArgs>? EnhancedProxyDetection { get; set; }

        [Input("epdForwardHeaderEnrichment")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEpdForwardHeaderEnrichmentInputArgs>? EpdForwardHeaderEnrichment { get; set; }

        [Input("failAction")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorFailActionInputArgs>? FailAction { get; set; }

        [Input("failoverBotManagerFeatureCompatibility")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorFailoverBotManagerFeatureCompatibilityInputArgs>? FailoverBotManagerFeatureCompatibility { get; set; }

        [Input("fastInvalidate")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorFastInvalidateInputArgs>? FastInvalidate { get; set; }

        [Input("firstPartyMarketing")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingInputArgs>? FirstPartyMarketing { get; set; }

        [Input("firstPartyMarketingPlus")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingPlusInputArgs>? FirstPartyMarketingPlus { get; set; }

        [Input("forwardRewrite")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteInputArgs>? ForwardRewrite { get; set; }

        [Input("g2oheader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorG2oheaderInputArgs>? G2oheader { get; set; }

        [Input("globalRequestNumber")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorGlobalRequestNumberInputArgs>? GlobalRequestNumber { get; set; }

        [Input("graphqlCaching")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorGraphqlCachingInputArgs>? GraphqlCaching { get; set; }

        [Input("gzipResponse")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorGzipResponseInputArgs>? GzipResponse { get; set; }

        [Input("hdDataAdvanced")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorHdDataAdvancedInputArgs>? HdDataAdvanced { get; set; }

        [Input("healthDetection")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorHealthDetectionInputArgs>? HealthDetection { get; set; }

        [Input("hsafEipBinding")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorHsafEipBindingInputArgs>? HsafEipBinding { get; set; }

        [Input("http2")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorHttp2InputArgs>? Http2 { get; set; }

        [Input("http3")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorHttp3InputArgs>? Http3 { get; set; }

        [Input("httpStrictTransportSecurity")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorHttpStrictTransportSecurityInputArgs>? HttpStrictTransportSecurity { get; set; }

        [Input("httpToHttpsUpgrade")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorHttpToHttpsUpgradeInputArgs>? HttpToHttpsUpgrade { get; set; }

        [Input("imOverride")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImOverrideInputArgs>? ImOverride { get; set; }

        [Input("imageAndVideoManager")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerInputArgs>? ImageAndVideoManager { get; set; }

        [Input("imageManager")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerInputArgs>? ImageManager { get; set; }

        [Input("imageManagerVideo")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoInputArgs>? ImageManagerVideo { get; set; }

        [Input("include")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorIncludeInputArgs>? Include { get; set; }

        [Input("instant")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorInstantInputArgs>? Instant { get; set; }

        [Input("instantConfig")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorInstantConfigInputArgs>? InstantConfig { get; set; }

        [Input("largeFileOptimization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationInputArgs>? LargeFileOptimization { get; set; }

        [Input("largeFileOptimizationAdvanced")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationAdvancedInputArgs>? LargeFileOptimizationAdvanced { get; set; }

        [Input("limitBitRate")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateInputArgs>? LimitBitRate { get; set; }

        [Input("logCustom")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorLogCustomInputArgs>? LogCustom { get; set; }

        [Input("mPulse")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorMPulseInputArgs>? MPulse { get; set; }

        [Input("manifestPersonalization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorManifestPersonalizationInputArgs>? ManifestPersonalization { get; set; }

        [Input("manifestRerouting")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingInputArgs>? ManifestRerouting { get; set; }

        [Input("manualServerPush")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorManualServerPushInputArgs>? ManualServerPush { get; set; }

        [Input("mediaAcceleration")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorMediaAccelerationInputArgs>? MediaAcceleration { get; set; }

        [Input("mediaAccelerationQuicOptout")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorMediaAccelerationQuicOptoutInputArgs>? MediaAccelerationQuicOptout { get; set; }

        [Input("mediaClient")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorMediaClientInputArgs>? MediaClient { get; set; }

        [Input("mediaFileRetrievalOptimization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorMediaFileRetrievalOptimizationInputArgs>? MediaFileRetrievalOptimization { get; set; }

        [Input("mediaOriginFailover")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorMediaOriginFailoverInputArgs>? MediaOriginFailover { get; set; }

        [Input("metadataCaching")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorMetadataCachingInputArgs>? MetadataCaching { get; set; }

        [Input("mobileSdkPerformance")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorMobileSdkPerformanceInputArgs>? MobileSdkPerformance { get; set; }

        [Input("modifyIncomingRequestHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorModifyIncomingRequestHeaderInputArgs>? ModifyIncomingRequestHeader { get; set; }

        [Input("modifyIncomingResponseHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorModifyIncomingResponseHeaderInputArgs>? ModifyIncomingResponseHeader { get; set; }

        [Input("modifyOutgoingRequestHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingRequestHeaderInputArgs>? ModifyOutgoingRequestHeader { get; set; }

        [Input("modifyOutgoingResponseHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorModifyOutgoingResponseHeaderInputArgs>? ModifyOutgoingResponseHeader { get; set; }

        [Input("modifyViaHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeaderInputArgs>? ModifyViaHeader { get; set; }

        [Input("origin")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginInputArgs>? Origin { get; set; }

        [Input("originCharacteristics")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginCharacteristicsInputArgs>? OriginCharacteristics { get; set; }

        [Input("originCharacteristicsWsd")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginCharacteristicsWsdInputArgs>? OriginCharacteristicsWsd { get; set; }

        [Input("originFailureRecoveryMethod")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryMethodInputArgs>? OriginFailureRecoveryMethod { get; set; }

        [Input("originFailureRecoveryPolicy")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyInputArgs>? OriginFailureRecoveryPolicy { get; set; }

        [Input("originIpAcl")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginIpAclInputArgs>? OriginIpAcl { get; set; }

        [Input("persistentClientConnection")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPersistentClientConnectionInputArgs>? PersistentClientConnection { get; set; }

        [Input("persistentConnection")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPersistentConnectionInputArgs>? PersistentConnection { get; set; }

        [Input("personallyIdentifiableInformation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPersonallyIdentifiableInformationInputArgs>? PersonallyIdentifiableInformation { get; set; }

        [Input("phasedRelease")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseInputArgs>? PhasedRelease { get; set; }

        [Input("preconnect")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectInputArgs>? Preconnect { get; set; }

        [Input("predictiveContentDelivery")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPredictiveContentDeliveryInputArgs>? PredictiveContentDelivery { get; set; }

        [Input("predictivePrefetching")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPredictivePrefetchingInputArgs>? PredictivePrefetching { get; set; }

        [Input("prefetch")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPrefetchInputArgs>? Prefetch { get; set; }

        [Input("prefetchable")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPrefetchableInputArgs>? Prefetchable { get; set; }

        [Input("prefreshCache")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorPrefreshCacheInputArgs>? PrefreshCache { get; set; }

        [Input("quality")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorQualityInputArgs>? Quality { get; set; }

        [Input("quicBeta")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorQuicBetaInputArgs>? QuicBeta { get; set; }

        [Input("randomSeek")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRandomSeekInputArgs>? RandomSeek { get; set; }

        [Input("rapid")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRapidInputArgs>? Rapid { get; set; }

        [Input("readTimeout")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorReadTimeoutInputArgs>? ReadTimeout { get; set; }

        [Input("realTimeReporting")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRealTimeReportingInputArgs>? RealTimeReporting { get; set; }

        [Input("realUserMonitoring")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRealUserMonitoringInputArgs>? RealUserMonitoring { get; set; }

        [Input("redirect")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRedirectInputArgs>? Redirect { get; set; }

        [Input("redirectplus")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRedirectplusInputArgs>? Redirectplus { get; set; }

        [Input("refererChecking")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRefererCheckingInputArgs>? RefererChecking { get; set; }

        [Input("removeQueryParameter")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRemoveQueryParameterInputArgs>? RemoveQueryParameter { get; set; }

        [Input("removeVary")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRemoveVaryInputArgs>? RemoveVary { get; set; }

        [Input("report")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorReportInputArgs>? Report { get; set; }

        [Input("requestControl")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlInputArgs>? RequestControl { get; set; }

        [Input("requestTypeMarker")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRequestTypeMarkerInputArgs>? RequestTypeMarker { get; set; }

        [Input("resourceOptimizer")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorResourceOptimizerInputArgs>? ResourceOptimizer { get; set; }

        [Input("resourceOptimizerExtendedCompatibility")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorResourceOptimizerExtendedCompatibilityInputArgs>? ResourceOptimizerExtendedCompatibility { get; set; }

        [Input("responseCode")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorResponseCodeInputArgs>? ResponseCode { get; set; }

        [Input("responseCookie")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorResponseCookieInputArgs>? ResponseCookie { get; set; }

        [Input("restrictObjectCaching")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRestrictObjectCachingInputArgs>? RestrictObjectCaching { get; set; }

        [Input("returnCacheStatus")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorReturnCacheStatusInputArgs>? ReturnCacheStatus { get; set; }

        [Input("rewriteUrl")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrlInputArgs>? RewriteUrl { get; set; }

        [Input("rumCustom")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorRumCustomInputArgs>? RumCustom { get; set; }

        [Input("saasDefinitions")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSaasDefinitionsInputArgs>? SaasDefinitions { get; set; }

        [Input("salesForceCommerceCloudClient")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientInputArgs>? SalesForceCommerceCloudClient { get; set; }

        [Input("salesForceCommerceCloudProvider")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudProviderInputArgs>? SalesForceCommerceCloudProvider { get; set; }

        [Input("salesForceCommerceCloudProviderHostHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudProviderHostHeaderInputArgs>? SalesForceCommerceCloudProviderHostHeader { get; set; }

        [Input("savePostDcaProcessing")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSavePostDcaProcessingInputArgs>? SavePostDcaProcessing { get; set; }

        [Input("scheduleInvalidation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationInputArgs>? ScheduleInvalidation { get; set; }

        [Input("scriptManagement")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorScriptManagementInputArgs>? ScriptManagement { get; set; }

        [Input("segmentedContentProtection")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSegmentedContentProtectionInputArgs>? SegmentedContentProtection { get; set; }

        [Input("segmentedMediaOptimization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSegmentedMediaOptimizationInputArgs>? SegmentedMediaOptimization { get; set; }

        [Input("segmentedMediaStreamingPrefetch")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSegmentedMediaStreamingPrefetchInputArgs>? SegmentedMediaStreamingPrefetch { get; set; }

        [Input("setVariable")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSetVariableInputArgs>? SetVariable { get; set; }

        [Input("simulateErrorCode")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSimulateErrorCodeInputArgs>? SimulateErrorCode { get; set; }

        [Input("siteShield")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldInputArgs>? SiteShield { get; set; }

        [Input("standardTlsMigration")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorStandardTlsMigrationInputArgs>? StandardTlsMigration { get; set; }

        [Input("standardTlsMigrationOverride")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorStandardTlsMigrationOverrideInputArgs>? StandardTlsMigrationOverride { get; set; }

        [Input("strictHeaderParsing")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorStrictHeaderParsingInputArgs>? StrictHeaderParsing { get; set; }

        [Input("subCustomer")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSubCustomerInputArgs>? SubCustomer { get; set; }

        [Input("sureRoute")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteInputArgs>? SureRoute { get; set; }

        [Input("tcpOptimization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorTcpOptimizationInputArgs>? TcpOptimization { get; set; }

        [Input("teaLeaf")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorTeaLeafInputArgs>? TeaLeaf { get; set; }

        [Input("tieredDistribution")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionInputArgs>? TieredDistribution { get; set; }

        [Input("tieredDistributionAdvanced")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedInputArgs>? TieredDistributionAdvanced { get; set; }

        [Input("tieredDistributionCustomization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionCustomizationInputArgs>? TieredDistributionCustomization { get; set; }

        [Input("timeout")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorTimeoutInputArgs>? Timeout { get; set; }

        [Input("uidConfiguration")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationInputArgs>? UidConfiguration { get; set; }

        [Input("validateEntityTag")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorValidateEntityTagInputArgs>? ValidateEntityTag { get; set; }

        [Input("verifyJsonWebToken")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenInputArgs>? VerifyJsonWebToken { get; set; }

        [Input("verifyJsonWebTokenForDcp")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpInputArgs>? VerifyJsonWebTokenForDcp { get; set; }

        [Input("verifyTokenAuthorization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationInputArgs>? VerifyTokenAuthorization { get; set; }

        [Input("virtualWaitingRoom")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVirtualWaitingRoomInputArgs>? VirtualWaitingRoom { get; set; }

        [Input("virtualWaitingRoomWithEdgeWorkers")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVirtualWaitingRoomWithEdgeWorkersInputArgs>? VirtualWaitingRoomWithEdgeWorkers { get; set; }

        [Input("visitorPrioritization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationInputArgs>? VisitorPrioritization { get; set; }

        [Input("visitorPrioritizationFifo")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationFifoInputArgs>? VisitorPrioritizationFifo { get; set; }

        [Input("visitorPrioritizationFifoStandalone")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationFifoStandaloneInputArgs>? VisitorPrioritizationFifoStandalone { get; set; }

        [Input("watermarking")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorWatermarkingInputArgs>? Watermarking { get; set; }

        [Input("webApplicationFirewall")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorWebApplicationFirewallInputArgs>? WebApplicationFirewall { get; set; }

        [Input("webSockets")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorWebSocketsInputArgs>? WebSockets { get; set; }

        [Input("webdav")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorWebdavInputArgs>? Webdav { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorInputArgs();
    }
}