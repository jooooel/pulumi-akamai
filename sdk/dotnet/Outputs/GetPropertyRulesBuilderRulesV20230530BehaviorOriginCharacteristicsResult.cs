// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorOriginCharacteristicsResult
    {
        public readonly bool? AccessKeyEncryptedStorage;
        public readonly string? AdcTitle;
        public readonly string? AuthenticationMethod;
        public readonly string? AuthenticationMethodTitle;
        public readonly string? AwsAccessKeyId;
        public readonly string? AwsAccessKeyVersionGuid;
        public readonly string? AwsArRegion;
        public readonly string? AwsHost;
        public readonly string? AwsRegion;
        public readonly string? AwsSecretAccessKey;
        public readonly string? AwsService;
        public readonly string? Country;
        public readonly ImmutableArray<string> CustomSignStrings;
        public readonly string? DirectConnectGeo;
        public readonly int? EncodingVersion;
        public readonly string? EndPointService;
        public readonly string? GcsAccessKeyVersionGuid;
        public readonly string? GcsHmacKeyAccessId;
        public readonly string? GcsHmacKeySecret;
        public readonly bool? HostnameTag;
        public readonly bool? Locked;
        public readonly string? Mslkey;
        public readonly string? Mslname;
        public readonly string? Nonce;
        public readonly string? OriginLocationTitle;
        public readonly bool? PropertyIdTag;
        public readonly string? RoleArn;
        public readonly string? SecretKey;
        public readonly string? TemplateUuid;
        public readonly bool? UseCustomSignString;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorOriginCharacteristicsResult(
            bool? accessKeyEncryptedStorage,

            string? adcTitle,

            string? authenticationMethod,

            string? authenticationMethodTitle,

            string? awsAccessKeyId,

            string? awsAccessKeyVersionGuid,

            string? awsArRegion,

            string? awsHost,

            string? awsRegion,

            string? awsSecretAccessKey,

            string? awsService,

            string? country,

            ImmutableArray<string> customSignStrings,

            string? directConnectGeo,

            int? encodingVersion,

            string? endPointService,

            string? gcsAccessKeyVersionGuid,

            string? gcsHmacKeyAccessId,

            string? gcsHmacKeySecret,

            bool? hostnameTag,

            bool? locked,

            string? mslkey,

            string? mslname,

            string? nonce,

            string? originLocationTitle,

            bool? propertyIdTag,

            string? roleArn,

            string? secretKey,

            string? templateUuid,

            bool? useCustomSignString,

            string? uuid)
        {
            AccessKeyEncryptedStorage = accessKeyEncryptedStorage;
            AdcTitle = adcTitle;
            AuthenticationMethod = authenticationMethod;
            AuthenticationMethodTitle = authenticationMethodTitle;
            AwsAccessKeyId = awsAccessKeyId;
            AwsAccessKeyVersionGuid = awsAccessKeyVersionGuid;
            AwsArRegion = awsArRegion;
            AwsHost = awsHost;
            AwsRegion = awsRegion;
            AwsSecretAccessKey = awsSecretAccessKey;
            AwsService = awsService;
            Country = country;
            CustomSignStrings = customSignStrings;
            DirectConnectGeo = directConnectGeo;
            EncodingVersion = encodingVersion;
            EndPointService = endPointService;
            GcsAccessKeyVersionGuid = gcsAccessKeyVersionGuid;
            GcsHmacKeyAccessId = gcsHmacKeyAccessId;
            GcsHmacKeySecret = gcsHmacKeySecret;
            HostnameTag = hostnameTag;
            Locked = locked;
            Mslkey = mslkey;
            Mslname = mslname;
            Nonce = nonce;
            OriginLocationTitle = originLocationTitle;
            PropertyIdTag = propertyIdTag;
            RoleArn = roleArn;
            SecretKey = secretKey;
            TemplateUuid = templateUuid;
            UseCustomSignString = useCustomSignString;
            Uuid = uuid;
        }
    }
}