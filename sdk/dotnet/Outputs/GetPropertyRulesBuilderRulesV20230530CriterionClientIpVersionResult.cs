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
    public sealed class GetPropertyRulesBuilderRulesV20230530CriterionClientIpVersionResult
    {
        public readonly bool? Locked;
        public readonly string? TemplateUuid;
        public readonly bool? UseXForwardedFor;
        public readonly string? Uuid;
        public readonly string? Value;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530CriterionClientIpVersionResult(
            bool? locked,

            string? templateUuid,

            bool? useXForwardedFor,

            string? uuid,

            string? value)
        {
            Locked = locked;
            TemplateUuid = templateUuid;
            UseXForwardedFor = useXForwardedFor;
            Uuid = uuid;
            Value = value;
        }
    }
}