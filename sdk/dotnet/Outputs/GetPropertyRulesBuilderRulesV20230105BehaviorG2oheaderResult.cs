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
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorG2oheaderResult
    {
        public readonly ImmutableArray<string> CustomSignStrings;
        public readonly string? DataHeader;
        public readonly bool? Enabled;
        public readonly int? EncodingVersion;
        public readonly bool? Locked;
        public readonly string? Nonce;
        public readonly string? SecretKey;
        public readonly string? SignedHeader;
        public readonly string? TemplateUuid;
        public readonly bool? UseCustomSignString;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorG2oheaderResult(
            ImmutableArray<string> customSignStrings,

            string? dataHeader,

            bool? enabled,

            int? encodingVersion,

            bool? locked,

            string? nonce,

            string? secretKey,

            string? signedHeader,

            string? templateUuid,

            bool? useCustomSignString,

            string? uuid)
        {
            CustomSignStrings = customSignStrings;
            DataHeader = dataHeader;
            Enabled = enabled;
            EncodingVersion = encodingVersion;
            Locked = locked;
            Nonce = nonce;
            SecretKey = secretKey;
            SignedHeader = signedHeader;
            TemplateUuid = templateUuid;
            UseCustomSignString = useCustomSignString;
            Uuid = uuid;
        }
    }
}