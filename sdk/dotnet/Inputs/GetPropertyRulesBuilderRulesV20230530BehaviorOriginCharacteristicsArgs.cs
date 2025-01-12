// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorOriginCharacteristicsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKeyEncryptedStorage")]
        public Input<bool>? AccessKeyEncryptedStorage { get; set; }

        [Input("adcTitle")]
        public Input<string>? AdcTitle { get; set; }

        [Input("authenticationMethod")]
        public Input<string>? AuthenticationMethod { get; set; }

        [Input("authenticationMethodTitle")]
        public Input<string>? AuthenticationMethodTitle { get; set; }

        [Input("awsAccessKeyId")]
        public Input<string>? AwsAccessKeyId { get; set; }

        [Input("awsAccessKeyVersionGuid")]
        public Input<string>? AwsAccessKeyVersionGuid { get; set; }

        [Input("awsArRegion")]
        public Input<string>? AwsArRegion { get; set; }

        [Input("awsHost")]
        public Input<string>? AwsHost { get; set; }

        [Input("awsRegion")]
        public Input<string>? AwsRegion { get; set; }

        [Input("awsSecretAccessKey")]
        public Input<string>? AwsSecretAccessKey { get; set; }

        [Input("awsService")]
        public Input<string>? AwsService { get; set; }

        [Input("country")]
        public Input<string>? Country { get; set; }

        [Input("customSignStrings")]
        private InputList<string>? _customSignStrings;
        public InputList<string> CustomSignStrings
        {
            get => _customSignStrings ?? (_customSignStrings = new InputList<string>());
            set => _customSignStrings = value;
        }

        [Input("directConnectGeo")]
        public Input<string>? DirectConnectGeo { get; set; }

        [Input("encodingVersion")]
        public Input<int>? EncodingVersion { get; set; }

        [Input("endPointService")]
        public Input<string>? EndPointService { get; set; }

        [Input("gcsAccessKeyVersionGuid")]
        public Input<string>? GcsAccessKeyVersionGuid { get; set; }

        [Input("gcsHmacKeyAccessId")]
        public Input<string>? GcsHmacKeyAccessId { get; set; }

        [Input("gcsHmacKeySecret")]
        public Input<string>? GcsHmacKeySecret { get; set; }

        [Input("hostnameTag")]
        public Input<bool>? HostnameTag { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("mslkey")]
        public Input<string>? Mslkey { get; set; }

        [Input("mslname")]
        public Input<string>? Mslname { get; set; }

        [Input("nonce")]
        public Input<string>? Nonce { get; set; }

        [Input("originLocationTitle")]
        public Input<string>? OriginLocationTitle { get; set; }

        [Input("propertyIdTag")]
        public Input<bool>? PropertyIdTag { get; set; }

        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("useCustomSignString")]
        public Input<bool>? UseCustomSignString { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorOriginCharacteristicsInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorOriginCharacteristicsInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorOriginCharacteristicsInputArgs();
    }
}
