// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorWatermarkingInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("abVariantLocation")]
        public Input<string>? AbVariantLocation { get; set; }

        [Input("decryptionPassword1")]
        public Input<string>? DecryptionPassword1 { get; set; }

        [Input("decryptionPassword2")]
        public Input<string>? DecryptionPassword2 { get; set; }

        [Input("decryptionPasswordId1")]
        public Input<string>? DecryptionPasswordId1 { get; set; }

        [Input("decryptionPasswordId2")]
        public Input<string>? DecryptionPasswordId2 { get; set; }

        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("miscellaneousSettingsTitle")]
        public Input<string>? MiscellaneousSettingsTitle { get; set; }

        [Input("patternDecryptionEnable")]
        public Input<bool>? PatternDecryptionEnable { get; set; }

        [Input("patternEncryptionTitle")]
        public Input<string>? PatternEncryptionTitle { get; set; }

        [Input("signatureVerificationEnable")]
        public Input<bool>? SignatureVerificationEnable { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("tokenSigningTitle")]
        public Input<string>? TokenSigningTitle { get; set; }

        [Input("useOriginalAsA")]
        public Input<bool>? UseOriginalAsA { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        [Input("verificationKeyId1")]
        public Input<string>? VerificationKeyId1 { get; set; }

        [Input("verificationKeyId2")]
        public Input<string>? VerificationKeyId2 { get; set; }

        [Input("verificationPublicKey1")]
        public Input<string>? VerificationPublicKey1 { get; set; }

        [Input("verificationPublicKey2")]
        public Input<string>? VerificationPublicKey2 { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorWatermarkingInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorWatermarkingInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorWatermarkingInputArgs();
    }
}
