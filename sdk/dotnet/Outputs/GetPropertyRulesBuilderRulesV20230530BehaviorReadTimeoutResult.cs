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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorReadTimeoutResult
    {
        public readonly bool? Locked;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;
        public readonly string? Value;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorReadTimeoutResult(
            bool? locked,

            string? templateUuid,

            string? uuid,

            string? value)
        {
            Locked = locked;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            Value = value;
        }
    }
}