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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlResult
    {
        public readonly string? Branded403File;
        public readonly int? Branded403StatusCode;
        public readonly string? Branded403Url;
        public readonly int? BrandedDenyCacheTtl;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlCloudletPolicyResult? CloudletPolicy;
        public readonly int? CloudletSharedPolicy;
        public readonly bool? EnableBranded403;
        public readonly bool? Enabled;
        public readonly bool? IsSharedPolicy;
        public readonly bool? Locked;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlNetStorageResult? NetStorage;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlResult(
            string? branded403File,

            int? branded403StatusCode,

            string? branded403Url,

            int? brandedDenyCacheTtl,

            Outputs.GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlCloudletPolicyResult? cloudletPolicy,

            int? cloudletSharedPolicy,

            bool? enableBranded403,

            bool? enabled,

            bool? isSharedPolicy,

            bool? locked,

            Outputs.GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlNetStorageResult? netStorage,

            string? templateUuid,

            string? uuid)
        {
            Branded403File = branded403File;
            Branded403StatusCode = branded403StatusCode;
            Branded403Url = branded403Url;
            BrandedDenyCacheTtl = brandedDenyCacheTtl;
            CloudletPolicy = cloudletPolicy;
            CloudletSharedPolicy = cloudletSharedPolicy;
            EnableBranded403 = enableBranded403;
            Enabled = enabled;
            IsSharedPolicy = isSharedPolicy;
            Locked = locked;
            NetStorage = netStorage;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}