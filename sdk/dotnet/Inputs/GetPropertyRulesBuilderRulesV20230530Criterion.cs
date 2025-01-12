// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530CriterionArgs : global::Pulumi.InvokeArgs
    {
        [Input("advancedImMatch")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionAdvancedImMatchArgs? AdvancedImMatch { get; set; }

        [Input("bucket")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionBucketArgs? Bucket { get; set; }

        [Input("cacheability")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionCacheabilityArgs? Cacheability { get; set; }

        [Input("chinaCdnRegion")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionChinaCdnRegionArgs? ChinaCdnRegion { get; set; }

        [Input("clientCertificate")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs? ClientCertificate { get; set; }

        [Input("clientIp")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionClientIpArgs? ClientIp { get; set; }

        [Input("clientIpVersion")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionClientIpVersionArgs? ClientIpVersion { get; set; }

        [Input("cloudletsOrigin")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionCloudletsOriginArgs? CloudletsOrigin { get; set; }

        [Input("contentDeliveryNetwork")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionContentDeliveryNetworkArgs? ContentDeliveryNetwork { get; set; }

        [Input("contentType")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionContentTypeArgs? ContentType { get; set; }

        [Input("deviceCharacteristic")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionDeviceCharacteristicArgs? DeviceCharacteristic { get; set; }

        [Input("ecmdAuthGroups")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthGroupsArgs? EcmdAuthGroups { get; set; }

        [Input("ecmdAuthScheme")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthSchemeArgs? EcmdAuthScheme { get; set; }

        [Input("ecmdIsAuthenticated")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionEcmdIsAuthenticatedArgs? EcmdIsAuthenticated { get; set; }

        [Input("ecmdUsername")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionEcmdUsernameArgs? EcmdUsername { get; set; }

        [Input("edgeWorkersFailure")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionEdgeWorkersFailureArgs? EdgeWorkersFailure { get; set; }

        [Input("fileExtension")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionFileExtensionArgs? FileExtension { get; set; }

        [Input("filename")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionFilenameArgs? Filename { get; set; }

        [Input("hostname")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionHostnameArgs? Hostname { get; set; }

        [Input("matchAdvanced")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvancedArgs? MatchAdvanced { get; set; }

        [Input("matchCpCode")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCodeArgs? MatchCpCode { get; set; }

        [Input("matchResponseCode")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCodeArgs? MatchResponseCode { get; set; }

        [Input("matchVariable")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs? MatchVariable { get; set; }

        [Input("metadataStage")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionMetadataStageArgs? MetadataStage { get; set; }

        [Input("originTimeout")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionOriginTimeoutArgs? OriginTimeout { get; set; }

        [Input("path")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionPathArgs? Path { get; set; }

        [Input("queryStringParameter")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionQueryStringParameterArgs? QueryStringParameter { get; set; }

        [Input("random")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionRandomArgs? Random { get; set; }

        [Input("recoveryConfig")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionRecoveryConfigArgs? RecoveryConfig { get; set; }

        [Input("regularExpression")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionRegularExpressionArgs? RegularExpression { get; set; }

        [Input("requestCookie")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestCookieArgs? RequestCookie { get; set; }

        [Input("requestHeader")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestHeaderArgs? RequestHeader { get; set; }

        [Input("requestMethod")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestMethodArgs? RequestMethod { get; set; }

        [Input("requestProtocol")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestProtocolArgs? RequestProtocol { get; set; }

        [Input("requestType")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestTypeArgs? RequestType { get; set; }

        [Input("responseHeader")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionResponseHeaderArgs? ResponseHeader { get; set; }

        [Input("serverLocation")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs? ServerLocation { get; set; }

        [Input("time")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionTimeArgs? Time { get; set; }

        [Input("tokenAuthorization")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorizationArgs? TokenAuthorization { get; set; }

        [Input("userAgent")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionUserAgentArgs? UserAgent { get; set; }

        [Input("userLocation")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionUserLocationArgs? UserLocation { get; set; }

        [Input("userNetwork")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionUserNetworkArgs? UserNetwork { get; set; }

        [Input("variableError")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionVariableErrorArgs? VariableError { get; set; }

        [Input("virtualWaitingRoomRequest")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionVirtualWaitingRoomRequestArgs? VirtualWaitingRoomRequest { get; set; }

        [Input("visitorPrioritizationRequest")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionVisitorPrioritizationRequestArgs? VisitorPrioritizationRequest { get; set; }

        public GetPropertyRulesBuilderRulesV20230530CriterionArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530CriterionArgs Empty => new GetPropertyRulesBuilderRulesV20230530CriterionArgs();
    }
}
